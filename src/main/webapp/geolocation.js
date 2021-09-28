function setUrlMaps(place_id) {
  const URL = `https://www.google.com/maps/embed/v1/directions?origin=place_id:${place_id}&destination=place_id:ChIJS4KFpvpbzpQRNNUIfcX83r4&key=AIzaSyCCE0hFijDgC0JRk59KCj5uMTc7guUCQzo`;
  document.querySelector('.iframe-maps').setAttribute('src', URL);
}


function codeAddress(e) {
  
  const input = document.querySelector('.meucep').value;
  
  fetch(`https://maps.googleapis.com/maps/api/geocode/json?address=${input}&sensor=false&key=AIzaSyCCE0hFijDgC0JRk59KCj5uMTc7guUCQzo`)
  .then( result => result.json())
  .then( data => setUrlMaps(data.results[0].place_id));
  
  e.preventDefault();
}