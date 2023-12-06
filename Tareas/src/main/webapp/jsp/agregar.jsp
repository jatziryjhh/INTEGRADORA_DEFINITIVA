<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>INTEGRADORA</title>
    <link rel="stylesheet" href="../assets/css/jsp.css">
</head>

<body>
<header>
    <img src="../assets/img/utez.png" alt="logo Utez" id="left-image" height: 100px; margin-top: 20px;>
    <h1 id="title">INTEGRADORA ESTRUCTURA DE DATOS</h1>
    <img src="../assets/img/datid.png" alt="Logo DATID" id="right-image">
</header>

<div id="big-title">AGREGAR</div>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<div id="button-containes">
    <div id="formulario"
         style="display: flex; justify-content: space-around; align-items: center; height: 100px; margin-top: 20px;">
        <form id="formularioAgregar" method="POST">
            <h1>AGREGAR TAREAS</h1>
            <input type="text" id="nombre" placeholder="NOMBRE">
            <input type="text" id="descripcion" placeholder="DESCRIPCIÓN">
            <input type="text" id="fecha" placeholder="FECHA">
            <input type="number" id="estado" placeholder="ESTADO">
            <button type="submit" >AGREGAR</button>
        </form>
    </div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <div id="button-container">
        <button class="big-button" onclick="window.location.href='../index.jsp'" >PRINCIPAL</button>
    </div>
</div>
</div>


</body>

</html>