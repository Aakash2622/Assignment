let result = document.getElementById('result');
let currentInput = '';

function appendValue(value) {
  currentInput += value;
  result.value = currentInput;
}

function clearResult() {
  currentInput = '';
  result.value = currentInput;
}

function calculate() {
  try {
    currentInput = eval(currentInput);
    result.value = currentInput;
  } catch (error) {
    result.value = 'Error';
  }
}
