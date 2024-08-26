class Estudiante(nombre:String, apellido:String, id:Int, estadoCivil:String, var curso:String):Persona(nombre, apellido, id, estadoCivil) {

     override fun datos() {
        println("""========================
            |       ESTUDIANTE
            |========================       
        """.trimMargin())
        super.datos()
         println("Curso: $curso")
    }

    fun camCurso(camCur:String){

        curso = camCur

    }

    override fun cambioEstadoCivil(camEstCivil: String) {
        super.cambioEstadoCivil(camEstCivil)
    }

}