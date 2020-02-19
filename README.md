# Palindrome-Challenge

Write an API that obtains an initial string from a [remote source](https://jsonplaceholder.typicode.com/users) and determines the number of [palindromic](https://en.wikipedia.org/wiki/Palindrome) strings that can be created from it.

## Details

The implementation should expose the following REST endpoint:
```
GET /palindromes/{id}
```

It should accept the following parameters:

| Name | Required | Default | Description              |
|------|----------|---------|--------------------------|
| `id` | yes      | -       | Remote record identifier |


Request example:
```
GET /palindromes/3
```

The implementation should obtain a user record with corresponding identifier from the [JSON Placeholder User API](https://jsonplaceholder.typicode.com/users). The `name` attribute value of the extracted user should be used as the input string for the palindrome computation. 

The implementation should calculate the number of palindromic strings that can be created using the input. The input value should be treated as case-insensitive (i.e. `b` and `B` is the same letter) and all white-spaces should be ignored. A valid palindrome only uses the letters in the input and is the same length as the input. Each letter can be used more than once and not every letter needs to be used.

For example, given the input `Graham Bell`, palindromes `aaahhhhaaa` and `bellmmlleb` are valid, but `aaa` and `hhhsagtbbb` are not.

Result should be returned in the following JSON format:
```
{ "name": "Nicola Tesla", "count": 531441 }
```

## Test Data

| Input          | Count  |
|----------------|--------|
| `Nicola Tesla` | 531441 |
| `Max Planck`   | 32768  |
| `Marie Curie`  | 16807  |
| `Maria Mayer`  | 7776   |

## Constraints

Choice of languages, frameworks and libraries is limited to a JVM-based technology. Solution utilizing [Spring Boot](https://spring.io/projects/spring-boot) is preferred.
