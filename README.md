<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<h3 align="center">OCR Exporter</h3>

  <p align="center">
    A Spring Boot-based OCR Exporter tool for text extraction from images or PDFs using OCR Space API.
    <br />
    <br />
    <a href="https://github.com/hyuseinleshov/ocr-exporter-api/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/hyuseinleshov/ocr-exporter-api/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

OCR Exporter is a tool built with Spring Boot that allows you to extract text from images and PDFs using the OCR Space API.
The extracted text can be saved in multiple formats such as text, PDF, Word, or directly to a database.
This tool is ideal for anyone looking to process large amounts of documents or images.



### Built With

* [Spring Boot](https://spring.io/projects/spring-boot)
* [OCR Space API](https://ocr.space/ocrapi)
* [Maven](https://maven.apache.org/)
* [MySQL](https://www.mysql.com/)



<!-- GETTING STARTED -->
## Getting Started

To get a local copy up and running, follow these steps.

### Prerequisites
- Java 17+
- Maven 3+
- MySQL

### Installation

1. Get a free API Key at [https://ocr.space/ocrapi](https://ocr.space/ocrapi)
2. Clone the repo
   ```sh
   git clone https://github.com/hyuseinleshov/ocr-exporter-api
3. Update the `application.properties` with your API and database configurations (i added it as an environment variables).
   ```sh
   OCR_API_KEY=your_api_key;
   DB_USERNAME=your_username;
   DB_PASSWORD=your_password
5. Finally run the application



<!-- CONTRIBUTING -->
## Contributing

Contributions are what make the open source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

If you have a suggestion that would make this better, please fork the repo and create a pull request. You can also simply open an issue with the tag "enhancement".
Don't forget to give the project a star! Thanks again!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.



<!-- CONTACT -->
## Contact

Hyusein - [Email me](mailto:hl.dev.acc@gmail.com)

Project Link: [https://github.com/hyuseinleshov/ocr-exporter-api](https://github.com/hyuseinleshov/ocr-exporter-api)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
[license-shield]: https://img.shields.io/github/license/hyuseinleshov/ocr-exporter-api.svg?style=for-the-badge
[license-url]: https://github.com/hyuseinleshov/ocr-exporter-api/blob/main/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/hyuseinleshov/
