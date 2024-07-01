This repository implements MVI, Clean Architecture, Dependency Injection with Dagger Hilt, Retrofit + Moshi and JetPack Compose

### What does MVI stand for?

MVI Stands for Model-View-Intent

**Model:**
It is a single source of truth for all states. Model ensures that it will update from only one place which is ViewModel / business logic.<br><br>
**View:** View demands user action requests & renders UI as per observation. <br><br>
**Intent:** It is the user action that the user can perform or requests from the Model. (Do not confuse it with Android Implicit and Explicit Intent).

In MVI, State will update from only a single place of the app which is business logic (ViewModel). It will ensure that the State will not change from any other place so State can represent as a sealed class.

The State holds the data and View observes those changes to render UI

When a user wants to perform any operation then action can send through the intent from View. ViewModel will handle the action and the State will observe from View using Kotlin flow or live data.

### MVI Flow:

The MVI architecture follows a unidirectional data flow, which ensures predictability and consistency in the application's behavior. Let's walk through the flow of data in MVI:


1. The View layer receives user interactions and converts them into intents, which are dispatched to the Model layer.

2. The Model processes the intent and generates a new state based on the current state and the intent received.

3. The new state is propagated back to the View layer, which updates the UI accordingly to reflect the changes.

4. The updated UI presents the new state to the user, and the cycle continues as the user interacts further.

### What is Clean Architecture?

Clean Architecture, at its heart, is a layered architecture. Each layer has its distinct role, creating a well-structured system where each part can evolve independently of the others. The structure of Clean Architecture comprises four layers.<br>

**Entities:** are the enterprise-wide business rules that contain Data Transfer Objects (DTOs) and encapsulate the most general business rules. They are the least likely to change in the event of any external changes.<br><br>
**Use cases:** also known as interactors, are the application-specific business rules of the software. This layer is isolated from changes to the database, common frameworks, and the UI.<br><br>
**Interface adapters:** are responsible for converting data from a convenient format for entities and use cases to a format that is applicable to databases and the web. This layer comprises Presenters from MVP, ViewModel from MVVM, and Gateways (also known as Repositories).<br><br>
**Frameworks and drivers:** are the outermost layers, comprising the web framework, database, UI, HTTP client, etc.<br><br>

An Android application with Clean Architecture gathers layers into three main modules:<br>

**Presentation Module:** This module includes the User Interface (UI), Presenter, and ViewModels.<br>

**Domain Module:** This module includes the Entities and Interactors.<br>

**Data Module:** This module includes the Databases and REST Clients.<br>

Organizing these modules will help make the application more efficient and easier to navigate. By creating these modules, we’ll be able to properly separate the application’s functionality and make updates and changes more seamlessly.

**Domain:** This module stores all objects that interact with other layers. 
In particular, Data Transfer Objects (DTOs) are implemented as standard Kotlin data classes and serve as a means of transferring data between different layers of the application.
The Repository is an interface that specifies the input parameters and return type for objects.<br><br>
**Data:** The Data module includes RestClient, Database, Adapters, and so on. <br>
 *Repository implementation:* A repository enables data access and source selection based on conditions. <br>
 *Adapters:* An Adapter converts the database and network clients entities to Domain module entities and vice versa. <br><br>
**Presentation:** Presentation module comprises ViewModels and the UI. In addition, we connect all dependencies from our DI in this module. <br>

### Jetpack Compose

Jetpack Compose is Google's modern toolkit for building native Android UI. It's part of the Jetpack suite of libraries that aim to follow best practices, reduce boilerplate code, and write code that works consistently across Android versions and devices.

Compose emphasizes a declarative approach to UI development, where you describe your UI by calling composables — functions that emit UI elements — instead of building a layout through an extensive XML structure. Composables react to the state changes and automatically update the UI with minimal input from the developer, allowing more time to be spent on crafting the user experience and less on managing the UI state.

Another advantage of using Jetpack Compose is its deep integration with Kotlin.


