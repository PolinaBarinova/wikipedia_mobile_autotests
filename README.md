<a href="https://ru.wikipedia.org/ "> <img src="media/logo.png" width="200" height="200"> 
<h2 >Проект по автоматизации мобильного приложения <a href="https://ru.wikipedia.org/ "> Wikipedia </a></h2> 

## Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins) и из терминала
- Allure-отчет
- Уведомление в Telegram о результатах прогона тестов
- Видео пример прохождения тестов

<a id="tools"></a>
## Технологии и инструменты:

<table>
  <tr>
    <td align="center"><img src="media/java-svgrepo-com.svg" width="50" height="50" alt="Java"/><br>Java</td>
    <td align="center"><img src="media/intellij-idea-svgrepo-com.svg" width="50" height="50" alt="IDEA"/><br>IntelliJ IDEA</td>
    <td align="center"><img src="media/github-badge-svgrepo-com.svg" width="50" height="50" alt="GitHub"/><br>GitHub</td>
    <td align="center"><img src="media/Junit5.svg" width="50" height="50" alt="JUnit 5"/><br>JUnit 5</td>
    <td align="center"><img src="media/gradle-svgrepo-com.svg" width="50" height="50" alt="Gradle"/><br>Gradle</td>
  </tr>
  <tr>
    <td align="center"><img src="media/Selenide.svg" width="50" height="50" alt="Selenide"/><br>Selenide</td>
    <td align="center"><img src="media/browserstack.svg" width="50" height="50" alt="Browserstack"/><br>Browserstack</td>
    <td align="center"><img src="media/Allure.svg" width="50" height="50" alt="Allure"/><br>Allure Report</td>
    <td align="center"><img src="media/Jenkins.svg" width="50" height="50" alt="Jenkins"/><br>Jenkins</td>
    <td align="center"><img src="media/Telegram.svg" width="50" height="50" alt="Telegram"/><br>Telegram</td>
  </tr>
</table>

<a id="cases"></a>
## Реализованные проверки:
- Поиск статьи
- Открытие статьи из результатов поиска
- Открытие изображения внутри статьи
- Возврат к главной странице после просмотра статьи

## <img alt="Jenkins" height="25" src="media/Jenkins.svg" width="25"/> Сборка в [Jenkins](https://jenkins.autotests.cloud/job/wikipedia_mobile_autotests/)


<p align="center">  
<img src="media/JenkinsBuild.jpg" alt="Jenkins" width="950"/></a>  
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

## <img alt="Allure" height="25" src="media/Allure.svg" width="25"/></a>  <a name="Allure"></a>Allure [Report](https://jenkins.autotests.cloud/job/vimeo_autotests/30/allure/)	</a>


## Основная страница отчёта

<p align="center">  
<img title="Allure Overview Dashboard" src="media/AllureReport.jpg" width="850">  
</p>  

____
## <img alt="Allure" height="25" src="media/Telegram.svg" width="25"/></a> Уведомление в Telegram при помощи бота
____
<p align="center">  
<img title="Allure Overview Dashboard" src="media/tgAllert.jpg" width="550">  
</p>

____
## </a> Примеры видео выполнения тестов
____
<p align="center">
<img title="Selenoid Video" src="media/test_video.gif" width="550" height="350"  alt="video">   
</p>
