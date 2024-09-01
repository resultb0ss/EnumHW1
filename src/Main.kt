fun main() {


    while (true){
        println("Выберите что хотите сделать\n1 - Узнать сезон месяца\n2 - выйти ")
        var inputChoose = readln()
        when(inputChoose) {
            "1" -> {
                println("Введите месяц года")
                println()
                var input = readln().lowercase()
                when (input){
                    "январь" -> println("Время года ${Mounth.JANUARY.seazon}")
                    "февраль" -> println("Время года ${Mounth.FEBRUARY.seazon}")
                    "март" -> println("Время года ${Mounth.MARCH.seazon}")
                    "апрель" -> println("Время года ${Mounth.APRIL.seazon}")
                    "май" -> println("Время года ${Mounth.MAY.seazon}")
                    "июнь" -> println("Время года ${Mounth.JUNE.seazon}")
                    "июль" -> println("Время года ${Mounth.JULY.seazon}")
                    "август" -> println("Время года ${Mounth.AUGUST.seazon}")
                    "сентябрь" -> println("Время года ${Mounth.SEPTEMBER.seazon}")
                    "октябрь" -> println("Время года ${Mounth.OCTOBER.seazon}")
                    "ноябрь" -> println("Время года ${Mounth.NOVEMBER.seazon}")
                    "декабрь" -> println("Время года ${Mounth.DECEMBER.seazon}")
                    else -> {
                        println("Такого значения нет")
                        break
                    }
                }
            }

            "2" -> break
            else -> {
                println("Такого значения нет")
                break
            }
        }

    }
}

enum class Mounth(val seazon: String, name: String, number: Number){
    JANUARY("Зима", "Январь",1),
    FEBRUARY("Зима", "Февраль",2),
    MARCH("Весна", "Март",3),
    APRIL("Весна", "Апрель",4),
    MAY("Весна", "Май",5),
    JUNE("Лето", "Июнь",6),
    JULY("Лето", "Июль",7),
    AUGUST("Лето", "Август",8),
    SEPTEMBER("Осень", "Сентябрь",9),
    OCTOBER("Осень", "Октябрь",10),
    NOVEMBER("Осень", "Ноябрь",11),
    DECEMBER("Зима", "Декабрь",12),
}