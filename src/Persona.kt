open class Persona(val nombre:String, val apellido:String, val id:Int, var estadoCivil: String) {

    open fun datos(){

        println("""Nombre: $nombre
            |Apellido: $apellido
            |ID: $id
            |Estado civil: $estadoCivil
        """.trimMargin())

    }
    open fun cambioEstadoCivil(camEstCivil: String){

        estadoCivil = camEstCivil

    }

}