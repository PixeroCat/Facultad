class Profesor(nombre:String, apellido:String, id:Int, estadoCivil:String, incorporacion:Int, numDespacho:Int,
               var departamento:String):Empleado(nombre, apellido, id, estadoCivil, incorporacion, numDespacho) {

    override fun datos() {
        println("""========================
            |       PROFESOR
            |========================                     
        """.trimMargin())
        super.datos()
        println("Departamento: $departamento")
    }

    fun camDepartamento(camDep:String){

        departamento = camDep

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