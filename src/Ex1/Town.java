package Ex1;

public class Town implements Comparable<Town> {
    private String name;
    private int distance;

    public Town(String name, int distance) {
        this.name = name;
        this.distance = distance;
    }

    public String getName() {
        return this.name;
    }


    public int getDistance(){
        return this.distance;
    }

    @Override
    public int compareTo(Town other) {
        if (this.distance < other.distance) {
            return -1;
        } else if (this.distance > other.distance) {
            return 1;
        }
        return 0;
    }


    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }

        if (this.getClass() != other.getClass()) {
            return false;
        }

        Town townObj = (Town) other;

        if (this.name.equals(townObj.name)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public String toString(){
        return this.name + " -> " + this.distance + " km"  + "\n";
    }
}

