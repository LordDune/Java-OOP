Подумать как описать логику взаимодействия человека и домашнего питомца.

Программа работает следующим образом:
1. Имеется абстрактный класс AnimalBase
2. Класс AnimalBase наследуют Классы Cat и Person, которые по-своему реализуют перемещение между комнатами и метод toString
3. Созданы 3 интерфеса:
    1) IntPet - интерфейс домашнего питомца, в котором объявленые методы, отвечающие за голод/сытость и получение еды от хозяина
    2) IntPetOwner - интерфейс владельца питомца, в котором объявлен метод, отвечающий за кормление питомца
    3) IntCall - отвечающий за общение и отклик.

4. Человек может позвать кошку. Если кошка находится в этой же комнате, она откликнется и помяукает. Если она находится в другой комнате, появится соответствующее сообщение.
5. Кошка может помяукать в адрес человека. Если они находятся в одной комнате, человек погладит кошку.
6. Человек и кошка могут перемещаться между комнатами. Когда кошка переходит в другую комнату, она теряет уровень сытости
7. Человек может покормить кошку, если они находятся в одной и той же комнате, тогда уровень сытости кошки увеличится до максимального
