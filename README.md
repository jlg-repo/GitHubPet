# GitHubPet 🐱💻

A virtual pet simulator built with JavaFX that gamifies your coding journey! Take care of your digital companion by committing code, feeding, and playing with them. The more you code, the more your pet evolves.

## Overview

GitHubPet is a Tamagotchi-style application where your pet's wellbeing depends on your coding activity. Built as a learning project for Object-Oriented Programming concepts, it demonstrates inheritance, polymorphism, interfaces, and JavaFX GUI development.

## Features

### Current Features ✅
- **Virtual Pet Care**: Feed, play with, and nurture your digital companion
- **Code Commit Integration**: Pets gain happiness and evolution points from coding activity
- **Pet Evolution System**: Pets evolve through different stages based on code points
- **Multiple Pet Types**: Choose between cats and dogs, each with unique behaviors
- **Real-time Stats**: Monitor hunger, happiness, and energy levels with progress bars
- **Interactive GUI**: Clean JavaFX interface with emoji-based pet representations
- **Time-based Mechanics**: Pet stats decay over time, requiring regular interaction

### Pet Types
- **🐱 Cat (Codey)**: Extra happiness from playing, purrs at your code
- **🐶 Dog (Gitty)**: Gains extra energy from food, enthusiastic about everything

## How to Run

### Prerequisites
- Java 22 or higher
- JavaFX 22+ (handled by Maven dependencies)

### Running the Application

**Method 1: Maven Wrapper (Recommended)**
```bash
# Windows
./mvnw.cmd clean javafx:run

# Mac/Linux  
./mvnw clean javafx:run
```

**Method 2: IntelliJ IDEA**
1. Open the project in IntelliJ
2. Navigate to View → Tool Windows → Maven
3. Expand Plugins → javafx
4. Double-click "javafx:run"

**Method 3: Direct Run**
- Right-click on `PetApp.java` and select "Run"

## Project Structure

```
src/main/java/com/jasong/githubpet/githubpet/
├── PetApp.java           # Main application entry point
├── PetController.java    # JavaFX controller for UI interactions
├── Pet.java             # Base pet class with core functionality
├── GitHubPet.java       # Extended pet with coding-specific features
├── Cat.java             # Cat-specific behaviors and traits
├── Dog.java             # Dog-specific behaviors and traits
└── Interactable.java    # Interface defining pet interaction contract

src/main/resources/com/jasong/githubpet/githubpet/
└── GitHubPet.fxml       # JavaFX UI layout definition
```

## Gameplay

1. **Choose Your Pet**: Select between a cat or dog companion
2. **Basic Care**: Use Feed and Play buttons to maintain your pet's wellbeing
3. **Code Commits**: Click "Commit Code" to simulate coding activity (future: real GitHub integration)
4. **Watch Evolution**: Earn code points to evolve your pet through different stages
5. **Time Management**: Pet stats decrease over time - regular care is essential!

## Technical Implementation

### OOP Concepts Demonstrated
- **Inheritance**: `Cat` and `Dog` extend `GitHubPet`, which extends `Pet`
- **Polymorphism**: Method overriding for pet-specific behaviors
- **Interfaces**: `Interactable` interface for consistent pet interaction
- **Encapsulation**: Protected fields with controlled access methods

### Design Patterns
- **MVC Pattern**: Separation of UI (FXML), Controller, and Model (Pet classes)
- **Template Method**: Base `Pet` class with extensible behavior hooks

## Future Features 🚀

### Planned Enhancements
- **Real GitHub API Integration**: Connect to actual GitHub repositories
    - Track real commits, pull requests, and contributions
    - Different code languages provide different benefits
    - Streak bonuses for consistent daily commits

- **Advanced Evolution System**:
    - Multiple evolution branches based on coding patterns
    - Special evolutions for different programming languages
    - Rare pets unlocked through coding achievements

- **Social Features**:
    - Leaderboards for most active developers

- **Enhanced Gameplay**:
    - Mini-games and coding challenges
    - Pet accessories and customization
    - Day/night cycles affecting pet behavior
    - Weather system impacting pet mood

- **Statistics & Analytics**:
    - Detailed coding pattern analysis
    - Pet care history and achievements
    - Integration with development tools (IDE plugins)

- **Platform Expansion**:
    - Mobile companion app
    - Web-based version
    - Desktop notifications for pet care reminders

## Code Quality Disclaimer ⚠️

**Please note**: This project is a work-in-progress learning exercise with several known areas for improvement:

### Current Limitations
- **Code Organization**: Some methods and classes need refactoring for better structure
- **Placeholder Logic**: Several methods contain simplified placeholder implementations
- **Unused Methods**: Some subclass methods (like `purr()` and `bark()`) are not yet integrated into the UI
- **Error Handling**: Limited exception handling and edge case management
- **Documentation**: Inconsistent JavaDoc coverage throughout the codebase

### Development Notes
- **Generative AI Assistance**: AI tools were used to help with:
    - JavaFX FXML layout troubleshooting
    - Maven configuration debugging
    - Some assistance with Object-oriented design pattern implementation
    - Bug fixing and error resolution
- **Learning Focus**: Priority was given to demonstrating OOP concepts over production-ready code quality
- **Rapid Prototyping**: Some design decisions favor quick implementation over long-term maintainability

### Future Cleanup Plans
- Comprehensive code review and refactoring
- Implementation of proper error handling
- Complete JavaDoc documentation
- Unit test coverage
- Code style standardization

## Contributing

This is primarily a learning project, but suggestions and improvements are welcome! Please feel free to:
- Report bugs or unexpected behavior
- Suggest new features or gameplay mechanics
- Propose code improvements or refactoring
- Share ideas for GitHub API integration

## License

Licensed under the Apache License, Version 2.0. See [LICENSE](LICENSE) for details.

## Acknowledgments

- Built as part of an Object-Oriented Programming course
- Inspired by classic Tamagotchi and virtual pet games
- JavaFX community for excellent documentation and examples
- Generative AI tools for development assistance and debugging support

---

*Happy coding, and may your pets thrive! 🐾*