function customerResquest(url) {
    // fetch(url)
    //     .then(response => response.json())
    //     .then(data => {
    //        return data;
    //     })
    //     .catch(error => {
    //         console.error('An error occurred:', error);
    //     });
    var xhr = new XMLHttpRequest();
    xhr.open('GET', url, true); // true for asynchronous request
    xhr.setRequestHeader('Content-Type', 'application/json');

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            // Handle the response data
            var data = JSON.parse(xhr.responseText);
            console.log(data);
        } else {
            console.log("erro onreadystatechange");
        }
    };
    xhr.send();


}