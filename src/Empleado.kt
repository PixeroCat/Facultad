open class Empleado(nombre:String, apellido:String, id:Int, estadoCivil:String, var incorporacion:Int,
                    var numDespacho:Int):Persona(nombre, apellido, id, estadoCivil) {

    override fun datos() {

        super.datos()
        println(
            """Año de incorporación: $incorporacion
            |Despacho: $numDespacho
        """.trimMargin()
        )

    }

    open fun camDespacho(camDesp:Int){

        numDespacho = camDesp

    }

    open fun camIncoporacion(camInco:Int){

        incorporacion = camInco

    }

    override fun cambioEstadoCivil(camEstCivil: String) {
        super.cambioEstadoCivil(camEstCivil)
    }




}