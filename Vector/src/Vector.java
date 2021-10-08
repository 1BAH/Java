public class Vector
{
    int x;
    int y;
    int z;

    //Конструктор
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //Длина вектора
    double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    //Скалярное произведение
    double scalarProduct(Vector vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    //Bекторное произведение
    Vector crossProduct(Vector v){
        return new Vector(y * v.z - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
    }

    //Косинус
    double cos(Vector v){
        return this.scalarProduct(v) / (this.length() * v.length());
    }

    //Сумма
    Vector add(Vector v){
        return new Vector(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    //Разность
    Vector subtract(Vector v){
        return new Vector(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Vector vec = (Vector) obj;
        return (x == vec.x) && (y == vec.y) && (z == vec.z);
    }

    @Override
    public int hashCode() {
        final int prime = 171;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        result = prime * result + z;
        return result;
    }


}
