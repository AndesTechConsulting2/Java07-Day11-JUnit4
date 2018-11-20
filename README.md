# Java07-Day11-JUnit4
JUnitCore, command line, maven

# Запуск тестов из коммандной строки

# Исходные данные.

# каталог локального репозитория maven: C:\Users\and\.m2
# каталог проекта C:\Users\and\IdeaProjectG2\Java07Day11JUnit
# пакет тестов: org.andestech.learning.rfb18.g2
# классы тестов: AppTest, AppTest2
# тест кэйсы: meth01Test, meth02Test, ..., meth06Test
# классы c JUnitCore: AppRunner
# класс для группировки тестов:  IRegressTest


# maven запуск тестов 

# очистка, перекомпиляция и запуск тестов всех классов начинающихся на AppTest
mvn clean test -Dtest="AppTest*"

# очистка, перекомпиляция и запуск тестов всех классов AppTest,AppTest2
mvn clean test -Dtest=AppTest,AppTest2

# запуск тестовых кейсов meth01Test, meth06Test в классах AppTest,AppTest2
mvn test -Dtest=AppTest#meth01Test,AppTest2#meth06Test

# запуск тестов, аннотированных @Category({IRegressTest.class}) в классах AppTest,AppTest2
mvn test -Dtest=AppTest* -Dgroups=IRegressTest


#java запуск тестов 

C:\Users\and\IdeaProjectG2\Java07Day11JUnit>java -cp target\Java07Day11JUnit-1.0-SNAPSHOT-tests.jar;
C:\Users\and\.m2\repository\junit\junit\4.11\junit-4.11.jar;C:\Users\and\.m2\repository\org\hamcrest
\hamcrest-core\1.3\hamcrest-core-1.3.jar org.andestech.learning.rfb18.g2.AppRunner


C:\Users\and\IdeaProjectG2\Java07Day11JUnit>java -cp target\Java07Day11JUnit-1.0-SNAPSHOT-tests.jar;
C:\Users\and\.m2\repository\junit\junit\4.11\junit-4.11.jar;C:\Users\and\.m2\repository\org\hamcrest
\hamcrest-core\1.3\hamcrest-core-1.3.jar org.junit.runner.JUnitCore org.andestech.learning.rfb18.g2.
AppTest org.andestech.learning.rfb18.g2.AppTest2
