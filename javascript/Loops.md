# Loops in JavaScript

## Introduction
Loops in JavaScript are used to execute a block of code repeatedly until a specified condition is met. JavaScript supports several types of loops, including `for`, `while`, and `do-while` loops, each serving different purposes.

## `for` Loop

The `for` loop repeats a block of code a specified number of times. It consists of three parts: initialization, condition, and iteration.

```javascript
for (initialization; condition; iteration) {
  // code to be executed
}
```

Example:

```javascript
for (let i = 0; i < 5; i++) {
  console.log(i);
}
// Output:
// 0
// 1
// 2
// 3
// 4
```

## `while` Loop

The `while` loop repeats a block of code while a specified condition is true. It checks the condition before executing the block.

```javascript
while (condition) {
  // code to be executed
}
```

Example:

```javascript
let i = 0;
while (i < 5) {
  console.log(i);
  i++;
}
// Output:
// 0
// 1
// 2
// 3
// 4
```
