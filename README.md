# Домашнее задание по Java

## Задание 1: Отправка сообщений из списка
Приложение при запуске создаёт список сообщений “Четыре”, “Пять”, “Шесть”. Затем с использованием итератора проходит по списку и отправляет каждое из сообщений, выжидая по 2 секунды между отправкой.

### Как запустить:
#### На Linux/MacOS:
1. Перейдите в директорию `task1`.
2. Выполните следующие команды:
  ```bash
  mvn clean install
  java -cp target/task1-1.0-SNAPSHOT.jar:libs/dummy-connector.jar com.example.App
  ```
#### На Windows:
1. Перейдите в директорию `task1`.
2. Выполните следующие команды:
  ```bash
  mvn clean install
  java -cp "target\task1-1.0-SNAPSHOT.jar:libs\dummy-connector.jar" com.example.App
  ```

## Задание 2: Отправка сообщений из файла
Приложение при запуске считывает сообщения из файла и отправляет каждое сообщение с интервалом в 2 секунды. Когда конец файла достигнут, приложение возвращается к началу файла и продолжает отправлять сообщения по кругу до остановки вручную.

### Как запустить:

#### На Linux/MacOS:
1. Перейдите в директорию `task2`.
2. Заполните файл `src/main/resources/messages.dat` своим текстом или создайте свой файл.
3. Выполните следующие команды:
  - Если вы хотите использовать файл `messages.dat` по умолчанию:
    ```bash
    mvn clean install
    java -cp target/task2-1.0-SNAPSHOT.jar:libs/dummy-connector.jar com.example.App
    ```
  - Если вы хотите использовать другой файл с сообщениями:
    ```bash
    mvn clean install
    java -cp target/task2-1.0-SNAPSHOT.jar:libs/dummy-connector.jar com.example.App /путь/к/вашему/файлу
    ```

#### На Windows:
1. Перейдите в директорию `task2`.
2. Заполните файл `src\main\resources\messages.dat` своим текстом или создайте свой файл.
3. Выполните следующие команды:
  - Если вы хотите использовать файл `messages.dat` по умолчанию:
    ```cmd
    mvn clean install
    java -cp "target\task2-1.0-SNAPSHOT.jar;libs\dummy-connector.jar" com.example.App
    ```
  - Если вы хотите использовать другой файл с сообщениями:
    ```cmd
    mvn clean install
    java -cp "target\task2-1.0-SNAPSHOT.jar;libs\dummy-connector.jar" com.example.App "C:\путь\к\вашему\файлу"
    ```
