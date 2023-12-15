//TIP Press <shortcut raw="SHIFT"/> twice to open the Search Everywhere dialog and type <b>show whitespaces</b>,
// then press <shortcut raw="ENTER"/>. You can now see whitespace characters in your code.

fun main(){
    var shape:Array<Shape> = arrayOf(
        Circle(3.0),
        Rectangle(5.0,6.0),
        Sphere(6.0)
    )
    shape.forEach {
        var name=it.getName()
        when(it){
            is TwoDemisional-> println(it.calculateArea())
            is ThreeDimensional-> println(it.calculateVolume())
            else->throw Exception("ERROR")
        }
    }
}
enum class ShapeType(type:String){
    Circle("daire"),
    Rectangle("dordbucaq"),
    Sphere("3boyutlu")
}
abstract class Shape{
    abstract fun getName():ShapeType
}
interface TwoDemisional{
    fun calculateArea():Double
}
interface ThreeDimensional{
    fun calculateVolume():Double
}
class Circle(val radius:Double):Shape(),TwoDemisional{
    override fun calculateArea():Double {
      return Math.PI * radius*radius
    }
    override fun getName():ShapeType{
        return ShapeType.Circle
    }
}
class Rectangle(val length:Double,val width:Double):Shape(),TwoDemisional{
    override fun calculateArea():Double{
        return length*width
    }

    override fun getName(): ShapeType {
        return ShapeType.Rectangle
    }
}
class Sphere(val radius:Double):Shape(),TwoDemisional,ThreeDimensional{
    override fun calculateArea(): Double {
        return 4*Math.PI*Math.pow(radius,2.0)
   }
    override fun calculateVolume():Double{
        return 4*Math.PI*Math.pow(radius,3.0)/3
    }

    override fun getName(): ShapeType {
        return ShapeType.Sphere
    }
}
//atdimsddsddsdsdsdds