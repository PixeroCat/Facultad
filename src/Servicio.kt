class Servicio(nombre:String, apellido:String, id:Int, estadoCivil:String, incorporacion:Int, numDespacho:Int,
    var seccion:String):Empleado(nombre, apellido, id, estadoCivil, incorporacion, numDespacho) {

    override fun datos() {
        println("""==================================
            |       PERSOMAL DE SERVICIO
            |==================================           
        """.trimMargin())
        super.datos()
        println("Sección: $seccion")
    }

    fun camSeccion(camSecc:String){

        seccion = camSecc

    }

    override fun cambioEstadoCivil(camEstCivil: String) {
        super.cambioEstadoCivil(camEstCivil)
    }

    override fun camDespacho(camDesp: Int) {
        super.camDespacho(camDesp)
    }

    override fun camIncoporacion(camInco: Int) {
        super.camIncoporacion(camInco)
    }
}