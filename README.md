# Лабораторная работа №1."Основы ООП в Java. Ввод/вывод, сериализация, наследование"

### Цель работы: изучить структуру программы и объектную модель Java. Научиться корректно использовать ввод/вывод и сериализацию.

### Порядок выполнения лабораторной работы №1

- Разработать программу, которая получает на вход CSV файл с информацией
об объектах согласно варианту. Программа считывает эти данные и помещает их в
массив. Затем массив сериализуется в бинарный файл, после чего десериализуется
из этого файла в новый.

- При выполнении лабораторной работы требуется воспользоваться
интерфейсами и абстрактными классами. Интерфейс должен содержать типовые
операции, необходимые для обработки информации по алгоритму, заданному в
задании. Второй интерфейс является базовым для сущностей индивидуального
задания. При наличии общих операций рекомендуется создать дополнительный
уровень иерархии с применением абстрактного класса.

### Требования к результирующей программе.

- Входной файл задается в качестве параметра при запуске программы.

- Необходимо проанализировать вариант и использовать наследование, отражающее иерархию классов.

- Каждый класс должен содержать 3 - 5 свойств.

- Программа должна корректно обрабатывать ошибочные данные во входном файле.

- Программа должна вести отдельный текстовый файл журнала с информацией о создаваемых объектах, ошибках во входном файле, результатах сериализации и десериализации.

### Структура 

- ```ArithmeticProgression```  - класс по работе с арифмитческой прогрессией
- ```GeometricProgression``` - класс по работе с геометрической прогрессией 
- ```Progression interface``` - интерфейс для прогрессий 
- ```ProgressionEntity abstract class``` - абстракный класс для прогрессий
- ```ProgressionFileManager``` - чтения данный из файла csv 
- ```SerializeProgressions``` - сериализация данных 
- ```DeserializeProgressions``` - десериализация данных 