import axios from "axios";

export default axios.create({
    //baseURL:'https://9c96-103-106-239-104.ap.ngrok.io',
    // Change baseURL to point at my local backend
    baseURL:'http://localhost:8080',
    headers: {"ngrok-skip-browser-warning": "true", "withCredentials": "true"}
});