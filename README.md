# Design Patterns Implementation

This repository contains implementations of various behavioral design patterns in Java. Each pattern is demonstrated with real-world examples to show how they can be applied in software development.

## Folder Descriptions
### StrategyPattern
Implements a payment processing system that allows flexibility in choosing different payment methods such as credit cards, PayPal, and cryptocurrency.

- **PaymentStrategy.java:** Interface for defining different payment methods.
- **CreditCardPayment.java, PayPalPayment.java, CryptoPayment.java:** Concrete implementations of different payment strategies.
- **ShoppingCart.java:** A class that manages items and selects the payment strategy at runtime.
- **Main.java:** Demonstrates how to switch between payment methods during the checkout process.

### ObserverPattern
A weather monitoring system that updates multiple display devices based on the data received from a weather station.

- **WeatherStation.java:** The subject that holds weather data.
- **WeatherDisplay.java:** Observer interface for different displays.
- **CurrentConditionsDisplay.java, StatisticsDisplay.java, ForecastDisplay.java:** Concrete display implementations.
- **WeatherData.java:** Manages the weather station and display updates.
- **Main.java:** Demonstrates the interaction between the weather station and displays.

### CommandPattern
A universal remote control system for smart home devices, allowing the execution and undoing of commands like turning devices on/off.

- **Command.java:** Interface for executing and undoing commands.
- **TurnTVOn.java, SetVolume.java, DimLights.java:** Concrete command implementations.
- **TV.java, Stereo.java, Light.java:** Smart device receivers.
- **RemoteControl.java:** Manages command slots and the undo functionality.
- **Main.java:** Demonstrates how to use the remote to control devices.

### StatePattern
An order processing system that changes its behavior based on the current state of an order (New, Paid, Shipped, Delivered, Cancelled).

- **State.java:** Interface for actions like payOrder(), shipOrder(), etc.
- **NewState.java, PaidState.java, ShippedState.java, DeliveredState.java, CancelledState.java:** Concrete state classes.
- **Order.java:** Maintains the current state and delegates actions.
- **Main.java:** Demonstrates various order states and transitions.

### ChainOfResponsibilityPattern
An expense approval system where requests pass through a chain of approvers (Team Lead, Manager, Director, CEO) based on the amount.

- **Approver.java:** Base class for handling approval requests.
- **TeamLead.java, Manager.java, Director.java, CEO.java:** Concrete approvers.
- **ExpenseRequest.java:** Stores details of the expense request.
- **ApprovalChain.java:** Sets up the chain of approvers and processes requests.
- **Main.java:** Demonstrates expense approvals based on different request amounts.

### MediatorPattern
A chat room application where users communicate with each other through a central mediator.

- **ChatMediator.java:** Interface for managing user messages.
- **ChatRoom.java:** Concrete mediator that handles communication between users.
- **User.java:** Abstract class for sending/receiving messages.
- **RegularUser.java, PremiumUser.java:** Concrete user types.
- **Main.java:** Demonstrates user communication via the chat room.

### MementoPattern
A document version control system that allows saving and restoring different document versions.

- **Document.java:** Originator class that manages the document's content.
- **DocumentVersion.java:** Memento that stores a document state.
- **VersionControl.java:** Caretaker that manages document versions.
- **Main.java:** Demonstrates version saving and restoration.

### VisitorPattern
A shape area calculator that uses the Visitor pattern to calculate the area of different shapes.

- **Shape.java:** Interface for accepting visitors.
- **Circle.java, Rectangle.java, Triangle.java:** Concrete shapes.
- **Visitor.java:** Interface for visiting shapes.
- **AreaCalculator.java:** Concrete visitor that calculates shape areas.
- **Drawing.java:** Holds a collection of shapes.
- **Main.java:** Demonstrates area calculations for different shapes.

### TemplateMethodPattern
A report generation system that creates reports in different formats (PDF, HTML, Plain Text) while keeping the overall generation process consistent.

- **ReportGenerator.java:** Abstract class defining the report generation process.
- **PDFReportGenerator.java, HTMLReportGenerator.java, PlainTextReportGenerator.java:** Concrete implementations for different formats.
- **ReportingSystem.java:** Uses the report generators.
- **Main.java:** Demonstrates the creation of reports in different formats.

### IteratorPattern
A playlist management system for traversing songs in different orders (sequential, shuffle, filtered by genre).

- **Playlist.java:** Manages a collection of songs.
- **Song.java:** Represents a song.
- **Iterator.java:** Interface for traversal.
- **SequentialIterator.java, ShuffleIterator.java, GenreFilterIterator.java:** Concrete iterators for different traversal methods.
- **Main.java:** Demonstrates song traversal in different orders.
