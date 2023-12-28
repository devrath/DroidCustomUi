<img src="https://github.com/devrath/devrath/blob/master/images/kotlin_logo.png" align="right" title="Kotlin Logo" width="120">

<h1 align="center">𝙳𝚛𝚘𝚒𝚍𝙲𝚞𝚜𝚝𝚘𝚖𝚄𝚒</h1>


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


## **`𝚂𝚞𝚙𝚙𝚘𝚛𝚝`** ☕
𝙸𝚏 𝚢𝚘𝚞 𝚏𝚎𝚎𝚕 𝚕𝚒𝚔𝚎 𝚜𝚞𝚙𝚙𝚘𝚛𝚝 𝚖𝚎 𝚊 𝚌𝚘𝚏𝚏𝚎𝚎 𝚏𝚘𝚛 𝚖𝚢 𝚎𝚏𝚏𝚘𝚛𝚝𝚜, 𝙸 𝚠𝚘𝚞𝚕𝚍 𝚐𝚛𝚎𝚊𝚝𝚕𝚢 𝚊𝚙𝚙𝚛𝚎𝚌𝚒𝚊𝚝𝚎 𝚒𝚝.</br>
<a href="https://www.buymeacoffee.com/devrath" target="_blank"><img src="https://www.buymeacoffee.com/assets/img/custom_images/yellow_img.png" alt="𝙱𝚞𝚢 𝙼𝚎 𝙰 𝙲𝚘𝚏𝚏𝚎𝚎" style="height: 41px !important;width: 174px !important;box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;-webkit-box-shadow: 0px 3px 2px 0px rgba(190, 190, 190, 0.5) !important;" ></a>

## **`𝙲𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚎`** 🙋‍♂️
𝚁𝚎𝚊𝚍 [𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗 𝚐𝚞𝚒𝚍𝚎𝚕𝚒𝚗𝚎𝚜](CONTRIBUTING.md) 𝚏𝚘𝚛 𝚖𝚘𝚛𝚎 𝚒𝚗𝚏𝚘𝚛𝚖𝚊𝚝𝚒𝚘𝚗 𝚛𝚎𝚐𝚊𝚛𝚍𝚒𝚗𝚐 𝚌𝚘𝚗𝚝𝚛𝚒𝚋𝚞𝚝𝚒𝚘𝚗.

## **`𝙵𝚎𝚎𝚍𝚋𝚊𝚌𝚔`** ✍️ 
𝙵𝚎𝚊𝚝𝚞𝚛𝚎 𝚛𝚎𝚚𝚞𝚎𝚜𝚝𝚜 𝚊𝚛𝚎 𝚊𝚕𝚠𝚊𝚢𝚜 𝚠𝚎𝚕𝚌𝚘𝚖𝚎, [𝙵𝚒𝚕𝚎 𝚊𝚗 𝚒𝚜𝚜𝚞𝚎 𝚑𝚎𝚛𝚎](https://github.com/devrath/DroidCustomUi/issues/new).

## **`𝙵𝚒𝚗𝚍 𝚝𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚞𝚜𝚎𝚏𝚞𝚕`** ? ❤️
𝚂𝚞𝚙𝚙𝚘𝚛𝚝 𝚒𝚝 𝚋𝚢 𝚌𝚕𝚒𝚌𝚔𝚒𝚗𝚐 𝚝𝚑𝚎 ⭐ 𝚋𝚞𝚝𝚝𝚘𝚗 𝚘𝚗 𝚝𝚑𝚎 𝚞𝚙𝚙𝚎𝚛 𝚛𝚒𝚐𝚑𝚝 𝚘𝚏 𝚝𝚑𝚒𝚜 𝚙𝚊𝚐𝚎. ✌️

## **`𝙻𝚒𝚌𝚎𝚗𝚜𝚎`** ![Licence](https://img.shields.io/github/license/google/docsy) :credit_card:
𝚃𝚑𝚒𝚜 𝚙𝚛𝚘𝚓𝚎𝚌𝚝 𝚒𝚜 𝚕𝚒𝚌𝚎𝚗𝚜𝚎𝚍 𝚞𝚗𝚍𝚎𝚛 𝚝𝚑𝚎 𝙰𝚙𝚊𝚌𝚑𝚎 𝙻𝚒𝚌𝚎𝚗𝚜𝚎 𝟸.𝟶 - 𝚜𝚎𝚎 𝚝𝚑𝚎 [𝙻𝙸𝙲𝙴𝙽𝚂𝙴](https://github.com/devrath/DroidCustomUi/blob/main/LICENSE) 𝚏𝚒𝚕𝚎 𝚏𝚘𝚛 𝚍𝚎𝚝𝚊𝚒𝚕𝚜.


<p align="center">
<a><img src="https://forthebadge.com/images/badges/built-for-android.svg"></a>
</p>
