![Banner](images/Logo-new.png)

# DroidCustomUi
This project demonstrates the use of preparing the custom ui components

[![Open Source? Yes!](https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github)](https://github.com/Naereen/badges/)
![Safe](https://img.shields.io/badge/Stay-Safe-red?logo=data:image/svg%2bxml;base64,PHN2ZyBpZD0iTGF5ZXJfMSIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwIDAgNTEwIDUxMCIgaGVpZ2h0PSI1MTIiIHZpZXdCb3g9IjAgMCA1MTAgNTEwIiB3aWR0aD0iNTEyIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxnPjxnPjxwYXRoIGQ9Im0xNzQuNjEgMzAwYy0yMC41OCAwLTQwLjU2IDYuOTUtNTYuNjkgMTkuNzJsLTExMC4wOSA4NS43OTd2MTA0LjQ4M2g1My41MjlsNzYuNDcxLTY1aDEyNi44MnYtMTQ1eiIgZmlsbD0iI2ZmZGRjZSIvPjwvZz48cGF0aCBkPSJtNTAyLjE3IDI4NC43MmMwIDguOTUtMy42IDE3Ljg5LTEwLjc4IDI0LjQ2bC0xNDguNTYgMTM1LjgyaC03OC4xOHYtODVoNjguMThsMTE0LjM0LTEwMC4yMWMxMi44Mi0xMS4yMyAzMi4wNi0xMC45MiA0NC41LjczIDcgNi41NSAxMC41IDE1LjM4IDEwLjUgMjQuMnoiIGZpbGw9IiNmZmNjYmQiLz48cGF0aCBkPSJtMzMyLjgzIDM0OS42M3YxMC4zN2gtNjguMTh2LTYwaDE4LjU1YzI3LjQxIDAgNDkuNjMgMjIuMjIgNDkuNjMgNDkuNjN6IiBmaWxsPSIjZmZjY2JkIi8+PHBhdGggZD0ibTM5OS44IDc3LjN2OC4wMWMwIDIwLjY1LTguMDQgNDAuMDctMjIuNjQgNTQuNjdsLTExMi41MSAxMTIuNTF2LTIyNi42NmwzLjE4LTMuMTljMTQuNi0xNC42IDM0LjAyLTIyLjY0IDU0LjY3LTIyLjY0IDQyLjYyIDAgNzcuMyAzNC42OCA3Ny4zIDc3LjN6IiBmaWxsPSIjZDAwMDUwIi8+PHBhdGggZD0ibTI2NC42NSAyNS44M3YyMjYuNjZsLTExMi41MS0xMTIuNTFjLTE0LjYtMTQuNi0yMi42NC0zNC4wMi0yMi42NC01NC42N3YtOC4wMWMwLTQyLjYyIDM0LjY4LTc3LjMgNzcuMy03Ny4zIDIwLjY1IDAgNDAuMDYgOC4wNCA1NC42NiAyMi42NHoiIGZpbGw9IiNmZjRhNGEiLz48cGF0aCBkPSJtMjEyLjgzIDM2MC4xMnYzMGg1MS44MnYtMzB6IiBmaWxsPSIjZmZjY2JkIi8+PHBhdGggZD0ibTI2NC42NSAzNjAuMTJ2MzBoMzYuMTRsMzIuMDQtMzB6IiBmaWxsPSIjZmZiZGE5Ii8+PC9nPjwvc3ZnPg==)


### Description
* Keeping the code decoupled as much as possible and having it resuable is one of the the important aspects of object oriented programming.
* While we use `view-model`,`service`,`repository` to seperate and keep the logics reusable, The UI layer also can be done similarly.
* Now One the the way of doing it is demostrated in the demo here with three varieties of use cases that are extensivey used by developers.

### Advantages
* Decoupled code 
* Reusable code in presentation logic
* Can fix bugs in one place and whereever the layer is used that gets reflected everywhere

### Disadvantages
* It consumes extra amount of time and effort to properly organize it 

### Files used per module in the project

**Demo Type** | **Files used** 
------------- | -------------- 
**Single level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevel/SingleLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level.xml) , [**CustomView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt) , [**CustomViewContents**](app/src/main/res/layout/error_view.xml)
**Multi level custom view** | [**Screen**](app/src/main/java/com/demo/code/ui/multiLevel/MultiLevelUiFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_multi_level.xml) , [**FirstLevelLayout**](app/src/main/res/layout/parent_error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**SecondLevelLayout**](app/src/main/res/layout/error_view.xml) , [**ParentErrorView**](app/src/main/java/com/demo/code/ui/custom/ParentErrorView.kt) , [**ChildErrorView**](app/src/main/java/com/demo/code/ui/custom/ErrorView.kt)
**Single level custom list view** | [**Screen**](app/src/main/java/com/demo/code/ui/singleLevelListView/SingleLevelListFragment.kt) , [**Layout**](app/src/main/res/layout/fragment_single_level_list.xml) , [**Adapter**](app/src/main/java/com/demo/code/ui/custom/CustomListAdapter.kt) , [**CustomListClass**](app/src/main/java/com/demo/code/ui/custom/CustomListItems.kt)

### Description about the demo in project 

**Demo Type** | **Description**
------------- | --------------
**Single level custom view** | Here there a custom view which is a error component having a `Tryagain` click button.<br /> On click of try again button we show a toast
**Multi level custom view** | Here the single level custom component is encapsulated in another level custom component called the parent custom component. <br /> Whenever we pass the event from our screen to parent custom component, It in-turn deligates to child if needed for child. <br />This we can have any number of nested level of components that can be added
**Single level custom list view** | Here we deponstrate the encapsulation of listview in a custom component. <br />Here we pass the data nd the callback to the custom list component. <br />There is a interface implemented in the screen from adapter of the list using which adapter can send the selection of item events in adapter

### Demo preview of project 
<img src="/images/demo.gif" width="320" height="660"/>

### Apk to download
<a href="main/apk/outputfile.apk" download>Apk to download</a> 

Who Made This?
--------------
<a href="http://stackoverflow.com/users/1083093/devrath">
<img src="http://stackoverflow.com/users/flair/1083093.png" width="208" height="58" alt="profile for Devrath at Stack Overflow, Q&amp;A for professional and enthusiast programmers" title="profile for Devrath at Stack Overflow, Q&amp;A for professional and enthusiast programmers">
</a>
