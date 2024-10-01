<a id="readme-top"></a>

<!-- PROJECT SHIELDS -->
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<h3 align="center">OCR Exporter Api</h3>

  <p align="center">
    A Spring Boot-based OCR Exporter tool for text extraction from images or PDFs using OCR Space API.
    <br />
    <br />
    <a href="https://github.com/hyuseinlesho/ocr-exporter-api/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/hyuseinlesho/ocr-exporter-api/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a>
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
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

OCR Exporter is a tool built with Spring Boot that allows you to extract text from images and PDFs using the OCR Space API.
The extracted text can be saved in multiple formats such as text, PDF, Word, or directly to a database.
This tool is ideal for anyone looking to process large amounts of documents or images.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* [Spring Boot](https://spring.io/projects/spring-boot)
* [OCR Space API](https://ocr.space/ocrapi)
* [Maven](https://maven.apache.org/)
* [MySQL](https://www.mysql.com/)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



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
   git clone https://github.com/hyuseinlesho/ocr-exporter-api
3. Update the `application.properties` with your database and API configurations.
4. Build and run the application
    ```sh
    mvn spring-boot:run

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE.txt` for more information.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- CONTACT -->
## Contact

Hyusein - [Email me](mailto:hl.dev.acc@gmail.com)

Project Link: [https://github.com/hyuseinlesho/ocr-exporter-api](https://github.com/hyuseinlesho/ocr-exporter-api)

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- MARKDOWN LINKS & IMAGES -->
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/hyuseinlesho/ocr-exporter-api/blob/main/LICENSE
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/hyuseinlesho/
