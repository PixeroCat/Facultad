fun main() {

    var opcion:Int
    var estCivil:String
    var curso:String
    var despacho:Int
    var departamento:String
    var seccion:String

    val estudiante = Estudiante(
        nombre = "Carlos",
        apellido = "Martínez",
        id = 101,
        estadoCivil = "Soltero",
        curso = "Ingeniería de Software"
    )

    val profesor = Profesor(
        nombre = "Ana",
        apellido = "López",
        id = 303,
        estadoCivil = "Divorciada",
        incorporacion = 2010,
        numDespacho = 120,
        departamento = "Matemáticas"
    )

    val servicio = Servicio(
        nombre = "Pedro",
        apellido = "Fernández",
        id = 404,
        estadoCivil = "Viudo",
        incorporacion = 2018,
        numDespacho = 200,
        seccion = "Mantenimiento"
    )

    while(true){

        println("""¿Que desea hacer?
            |1- Cambiar estado civil de alguien
            |2- Editar estudiante
            |3- Editar despacho
            |4- Editar departamento profesor
            |5- Editar seccion persona servicio
            |6- Imprimir usuarios
        """.trimMargin())
        opcion = readln().toInt()

        when(opcion){

            1 -> {

                println("""A quien le quiere cambiar el estado civil?
                    |1- Estudante
                    |2- Profesor
                    |3- Personal servicio
                """.trimMargin())
                opcion = readln().toInt()

                when(opcion){

                    1 -> {

                        println("Escriba el nuevo estado civil: ")
                        estCivil = readln().toString()
                        estudiante.cambioEstadoCivil(estCivil)
                        println("Estado civil actualizado")
                    }
                    2 -> {

                        println("Escriba el nuevo estado civil: ")
                        estCivil = readln().toString()
                        profesor.cambioEstadoCivil(estCivil)
                        println("Estado civil actualizado")
                    }
                    3 -> {

                        println("Escriba el nuevo estado civil: ")
                        estCivil = readln().toString()
                        servicio.cambioEstadoCivil(estCivil)
                        println("Estado civil actualizado")
                    }


                }

            }
            2 -> {

                println("""Cambio de matricula.
                    |Escriba el curso nuevo
                """.trimMargin())
                curso = readln().toString()
                estudiante.camCurso(curso)

            }
            3 -> {

                println("""A quien desea reasignar el despacho?
                    |1- Profesor
                    |2- Persona servicio
                """.trimMargin())
                opcion = readln().toInt()
                when(opcion){

                    1 -> {

                        println("Escriba el nuevo despacho de profesor.")
                        despacho = readln().toInt()
                        profesor.camDespacho(despacho)

                    }
                    2 -> {

                        println("Escriba el nuevo despacho de persona de servicio.")
                        despacho = readln().toInt()
                        servicio.camDespacho(despacho)

                    }

                }


            }
            4 -> {

                println("Escriba el departamento del profesor:")
                departamento = readln().toString()
                profesor.camDepartamento(departamento)

            }

            5 -> {

                println("Escriba la seccion de la persona de servicio:")
                seccion = readln().toString()
                servicio.camSeccion(seccion)

            }

            6 -> {

                estudiante.datos()
                profesor.datos()
                servicio.datos()

            }

        }


    }


}