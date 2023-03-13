Описать с ООП стиле, логику взаимодействия объектов реального мира между собой: шкаф-человек.

Программа работает следующим образом:
1) Создание экзмпляров класса Шкаф (Closet), класса Персона (Person)
2) Шкаф имеет поля: имя, количество имеющихся вещей и максимальное количество вещей, а также состояние открыт/закрыт
3) Персона имеет поля: имя, количество вещей
4) Вывод информации об экземплярах классов System.out.println(player)
5) Человек может: 
        
        открывать шкаф          player.open(closet)
        
        зарывать шкаф           player.close(closet)
        
        брать из шкафа вещи     player.get(closet, 10)
        
        класть в шкаф вещи      player.put(closet, 10)
6) Пока шкаф закрыт, в него нельзя ничего положить
7) Если в результате добавления вещей в шкаф он переполнится, операция отменится