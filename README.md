<img src="https://github.com/devrath/devrath/blob/master/images/kotlin_logo.png" align="right" title="Kotlin Logo" width="120">

# DroidCustomUi

### **`𝙸𝚗𝚝𝚛𝚘𝚍𝚞𝚌𝚝𝚒𝚘𝚗`** 💡
This project demonstrates the use of preparing the custom ui components. Keeping all the presentation logic of a view group in one place helps in improving the re-usability of the application and also easy maintaining it.


[![Open Source? Yes!](https://badgen.net/badge/Open%20Source%20%3F/Yes%21/blue?icon=github)](https://github.com/Naereen/badges/)
![Safe](https://img.shields.io/badge/Stay-Safe-red?logo=data:image/svg%2bxml;base64,PHN2ZyBpZD0iTGF5ZXJfMSIgZW5hYmxlLWJhY2tncm91bmQ9Im5ldyAwIDAgNTEwIDUxMCIgaGVpZ2h0PSI1MTIiIHZpZXdCb3g9IjAgMCA1MTAgNTEwIiB3aWR0aD0iNTEyIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPjxnPjxnPjxwYXRoIGQ9Im0xNzQuNjEgMzAwYy0yMC41OCAwLTQwLjU2IDYuOTUtNTYuNjkgMTkuNzJsLTExMC4wOSA4NS43OTd2MTA0LjQ4M2g1My41MjlsNzYuNDcxLTY1aDEyNi44MnYtMTQ1eiIgZmlsbD0iI2ZmZGRjZSIvPjwvZz48cGF0aCBkPSJtNTAyLjE3IDI4NC43MmMwIDguOTUtMy42IDE3Ljg5LTEwLjc4IDI0LjQ2bC0xNDguNTYgMTM1LjgyaC03OC4xOHYtODVoNjguMThsMTE0LjM0LTEwMC4yMWMxMi44Mi0xMS4yMyAzMi4wNi0xMC45MiA0NC41LjczIDcgNi41NSAxMC41IDE1LjM4IDEwLjUgMjQuMnoiIGZpbGw9IiNmZmNjYmQiLz48cGF0aCBkPSJtMzMyLjgzIDM0OS42M3YxMC4zN2gtNjguMTh2LTYwaDE4LjU1YzI3LjQxIDAgNDkuNjMgMjIuMjIgNDkuNjMgNDkuNjN6IiBmaWxsPSIjZmZjY2JkIi8+PHBhdGggZD0ibTM5OS44IDc3LjN2OC4wMWMwIDIwLjY1LTguMDQgNDAuMDctMjIuNjQgNTQuNjdsLTExMi41MSAxMTIuNTF2LTIyNi42NmwzLjE4LTMuMTljMTQuNi0xNC42IDM0LjAyLTIyLjY0IDU0LjY3LTIyLjY0IDQyLjYyIDAgNzcuMyAzNC42OCA3Ny4zIDc3LjN6IiBmaWxsPSIjZDAwMDUwIi8+PHBhdGggZD0ibTI2NC42NSAyNS44M3YyMjYuNjZsLTExMi41MS0xMTIuNTFjLTE0LjYtMTQuNi0yMi42NC0zNC4wMi0yMi42NC01NC42N3YtOC4wMWMwLTQyLjYyIDM0LjY4LTc3LjMgNzcuMy03Ny4zIDIwLjY1IDAgNDAuMDYgOC4wNCA1NC42NiAyMi42NHoiIGZpbGw9IiNmZjRhNGEiLz48cGF0aCBkPSJtMjEyLjgzIDM2MC4xMnYzMGg1MS44MnYtMzB6IiBmaWxsPSIjZmZjY2JkIi8+PHBhdGggZD0ibTI2NC42NSAzNjAuMTJ2MzBoMzYuMTRsMzIuMDQtMzB6IiBmaWxsPSIjZmZiZGE5Ii8+PC9nPjwvc3ZnPg==)


### `𝙳𝚎𝚜𝚌𝚛𝚒𝚙𝚝𝚒𝚘𝚗`
* Keeping the code decoupled as much as possible and having it resuable is one of the the important aspects of object oriented programming.
* While we use `view-model`,`service`,`repository` to seperate and keep the logics reusable, The UI layer also can be done similarly.
* Now One the the way of doing it is demostrated in the demo here with three varieties of use cases that are extensivey used by developers.

### `𝙰𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜`
* Decoupled code 
* Reusable code in presentation logic
* Can fix bugs in one place and whereever the layer is used that gets reflected everywhere

### `𝙳𝚒𝚜𝚊𝚍𝚟𝚊𝚗𝚝𝚊𝚐𝚎𝚜`
* It consumes extra amount of time and effort to properly organize it 

### `𝙵𝚒𝚕𝚎𝚜 𝚞𝚜𝚎𝚍 𝚙𝚎𝚛 𝚖𝚘𝚍𝚞𝚕𝚎 𝚒𝚗 𝚝𝚑𝚎 𝚙𝚛𝚘𝚓𝚎𝚌𝚝`

**Demo Type** | **Files used** 
------------- | -------------- 
**𝚂𝚒𝚗𝚐𝚕𝚎-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚟𝚒𝚎𝚠** | [**𝚂𝚌𝚛𝚎𝚎𝚗**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/singleLevel/SingleLevelUiFragment.kt) , [**𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/fragment_single_level.xml) , [**𝙲𝚞𝚜𝚝𝚘𝚖𝚅𝚒𝚎𝚠**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/custom/ErrorView.kt) , [**𝙲𝚞𝚜𝚝𝚘𝚖𝚅𝚒𝚎𝚠𝙲𝚘𝚗𝚝𝚎𝚗𝚝𝚜**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/error_view.xml)
**𝙼𝚞𝚕𝚝𝚒-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚟𝚒𝚎𝚠** | [**𝚂𝚌𝚛𝚎𝚎𝚗**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/multiLevel/MultiLevelUiFragment.kt) , [**𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/fragment_multi_level.xml) , [**𝙵𝚒𝚛𝚜𝚝𝙻𝚎𝚟𝚎𝚕𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/parent_error_view.xml) , [**𝚂𝚎𝚌𝚘𝚗𝚍𝙻𝚎𝚟𝚎𝚕𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/error_view.xml) , [**𝚂𝚎𝚌𝚘𝚗𝚍𝙻𝚎𝚟𝚎𝚕𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/error_view.xml) , [**𝙿𝚊𝚛𝚎𝚗𝚝𝙴𝚛𝚛𝚘𝚛𝚅𝚒𝚎𝚠**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/custom/ParentErrorView.kt) , [**𝙲𝚑𝚒𝚕𝚍𝙴𝚛𝚛𝚘𝚛𝚅𝚒𝚎𝚠**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/custom/ErrorView.kt)
**𝚂𝚒𝚗𝚐𝚕𝚎-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚕𝚒𝚜𝚝 𝚟𝚒𝚎𝚠** | [**𝚂𝚌𝚛𝚎𝚎𝚗**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/singleLevelListView/SingleLevelListFragment.kt) , [**𝙻𝚊𝚢𝚘𝚞𝚝**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/res/layout/fragment_single_level_list.xml) , [**𝙰𝚍𝚊𝚙𝚝𝚎𝚛**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/custom/CustomListAdapter.kt) , [**𝙲𝚞𝚜𝚝𝚘𝚖𝙻𝚒𝚜𝚝𝙲𝚕𝚊𝚜𝚜**](https://github.com/devrath/DroidCustomUi/blob/main/application/app/src/main/java/com/demo/code/ui/custom/CustomListItems.kt)

### `𝙳𝚎𝚜𝚌𝚛𝚒𝚙𝚝𝚒𝚘𝚗 𝚊𝚋𝚘𝚞𝚝 𝚝𝚑𝚎 𝚍𝚎𝚖𝚘 𝚒𝚗 𝚙𝚛𝚘𝚓𝚎𝚌𝚝` 

**𝙳𝚎𝚖𝚘 𝚃𝚢𝚙𝚎** | **𝙳𝚎𝚜𝚌𝚛𝚒𝚙𝚝𝚒𝚘𝚗**
------------- | --------------
**𝚂𝚒𝚗𝚐𝚕𝚎-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚟𝚒𝚎𝚠** | Here there a custom view which is a error component having a `Tryagain` click button.<br /> On click of try again button we show a toast
**𝙼𝚞𝚕𝚝𝚒-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚟𝚒𝚎𝚠** | Here the single level custom component is encapsulated in another level custom component called the parent custom component. <br /> Whenever we pass the event from our screen to parent custom component, It in-turn deligates to child if needed for child. <br />This we can have any number of nested level of components that can be added.
**𝚂𝚒𝚗𝚐𝚕𝚎-𝚕𝚎𝚟𝚎𝚕 𝚌𝚞𝚜𝚝𝚘𝚖 𝚕𝚒𝚜𝚝 𝚟𝚒𝚎𝚠** | Here we deponstrate the encapsulation of listview in a custom component. <br />Here we pass the data nd the callback to the custom list component. <br />There is a interface implemented in the screen from adapter of the list using which adapter can send the selection of item events in adapter

### `𝙳𝚎𝚖𝚘 𝚙𝚛𝚎𝚟𝚒𝚎𝚠 𝚘𝚏 𝚝𝚑𝚎 𝚙𝚛𝚘𝚓𝚎𝚌𝚝` :movie_camera:
<img src="/images/demo.gif" width="320" height="660"/>

### `𝙰𝚙𝚔 𝚝𝚘 𝚍𝚘𝚠𝚗𝚕𝚘𝚊𝚍` :card_file_box:
<a href="https://github.com/devrath/DroidCustomUi/blob/main/apk/outputfile.apk" download>Click here to download</a> 

## **`𝙲𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚎`** 🙋‍♂️
Read [contribution guidelines](CONTRIBUTING.md) for more information regarding contribution.

## **`𝙵𝚎𝚎𝚍𝚋𝚊𝚌𝚔`** ✍️ 
Feature requests are always welcome, [File an issue here](https://github.com/devrath/DroidCustomUi/issues/new).

## **`𝙵𝚒𝚗𝚍 𝚝𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚞𝚜𝚎𝚏𝚞𝚕`** ? ❤️
Support it by clicking the ⭐ button on the upper right of this page. ✌️

## **`𝙻𝚒𝚌𝚎𝚗𝚜𝚎`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
This project is licensed under the Apache License 2.0 - see the [LICENSE](https://github.com/devrath/DroidCustomUi/blob/main/LICENSE) file for details


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>
