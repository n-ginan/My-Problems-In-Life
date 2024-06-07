fun main() {
    print(getVolumeOfCuboid(3.2, 3.3, 2.2))
}

fun getVolumeOfCuboid(length: Double, width: Double, height: Double): Double = length * width * height

/*
Bob needs a fast way to calculate the volume of a cuboid with three values: the length, width and height of the cuboid. Write a function to help Bob with this calculation.
assertEquals(4.0, getVolumeOfCuboid(1.0, 2.0, 2.0), delta);
*/