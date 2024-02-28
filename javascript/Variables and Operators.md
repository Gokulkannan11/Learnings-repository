# JavaScript Variables and Operators

## Variables
In JavaScript, variables are used to store data values. They are declared using the `var`, `let`, or `const` keyword.

- `var` is the traditional way of declaring variables. It has function scope.
- `let` allows you to declare block-scoped variables. It's commonly used when the variable's value will change.
- `const` is used for variables whose value will not change throughout the program. It also has block scope.

Example:
```javascript
var age = 25;
let name = "John";
const PI = 3.14;



Operators in JavaScript are symbols that perform operations on variables and values.

### Arithmetic Operators

- Addition (`+`)
- Subtraction (`-`)
- Multiplication (`*`)
- Division (`/`)
- Modulus (`%`)

Example:

````javascript
let result = 10 + 5; // result equals 15


### Comparison Operators

- Equal to (`==`)
- Not equal to (`!=`)
- Strict equal to (`===`)
- Strict not equal to (`!==`)
- Greater than (`>`)
- Less than (`<`)
- Greater than or equal to (`>=`)
- Less than or equal to (`<=`)

Example:

````javascript
let x = 10;
let y = 5;
console.log(x > y); // Output: true


### Logical Operators

- Logical AND (`&&`)
- Logical OR (`||`)
- Logical NOT (`!`)

Example:

````javascript
let a = true;
let b = false;
console.log(a && b); // Output: false