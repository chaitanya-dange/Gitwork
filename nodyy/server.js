const express = require('express');
const app = express();

app.get('/', (req, res) => {
  /* res.send('Hello, World!'); */
  /* res.send('This is awesome!!!!!'); */
  res.send('Alpha Bravo Charlie Delta Foxtail');
});

app.listen(3000, () => {
  console.log('Server is listening on port 3000');
});