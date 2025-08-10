<a href="https://ru.wikipedia.org/ "> <img src="media/logo.png" width="200" height="200"> 
<h2 >Проект по автоматизации тестирования мобильного приложения <a href="https://ru.wikipedia.org/ "> Wikipedia </a></h2> 

## Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## Технологии и инструменты:

<p align="center">
  <a href="https://www.java.com/"><img width="8%" title="Java" src="media/java-svgrepo-com.svg"></a>
  <a href="https://www.jetbrains.com/idea/"><img width="8%" title="IntelliJ IDEA" src="media/intellij-idea-svgrepo-com.svg"></a>
  <a href="https://github.com/"><img width="8%" title="GitHub" src="media/github-badge-svgrepo-com.svg"></a>
  <a href="https://junit.org/junit5/"><img width="8%" title="JUnit 5" src="media/Junit5.svg"></a>
  <a href="https://gradle.org/"><img width="8%" title="Gradle" src="media/gradle-svgrepo-com.svg"></a>
  <a href="https://qameta.io/"><img width="8%" title="Allure Report" src="media/Allure.svg"></a>
  <a href="https://www.jenkins.io/"><img width="8%" title="Jenkins" src="media/Jenkins.svg"></a>
  <a href="https://web.telegram.org/"><img width="8%" title="Telegram" src="media/Telegram.svg"></a>
  <a href="https://ru.selenide.org/"><img width="8%" title="Selenide" src="media/Selenide.svg"></a>
  <a href="https://www.browserstack.com/"><img width="8%" title="Browserstack" src="media/browserstack.svg"></a>
</p>

<a id="cases"></a>
## Реализованные проверки:
- Поиск статьи
- Открытие статьи из результатов поиска
- Открытие изображения внутри статьи
- Возврат к главной странице после просмотра статьи

## <img alt="Jenkins" height="25" src="media/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/wikipedia_mobile_autotests/)


<p align="center">  
<img src="media/JenkinsBuild.jpg" alt="Jenkins" width="950"/>  
</p>

## Команда для запуска из терминала
Локальный запуск:
```bash
gradle clean test
```
Удаленный запуск через Jenkins:
```bash  
clean test 
```

## <img alt="Allure" height="25" src="media/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure [Report](https://jenkins.autotests.cloud/job/wikipedia_mobile_autotests/1/allure/)	</a>


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/AllureReport.jpg" width="850">  
</p>  

## Тест-кейсы

<p align="center">  
<img title="Allure Suites" src="media/testcase.jpg" width="850">  
</p>  

## <img alt="Allure" height="25" src="media/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота

<p align="center">  
<img title="Allure Overview Dashboard" src="media/tgAllert.jpg" width="550">  
</p>

## Пример видео выполнения тестов 

<p align="center">
<img title="Selenoid Video" src="media/test_video.gif" height="450"  alt="video">   
</p>
