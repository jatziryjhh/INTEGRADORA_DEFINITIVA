<!DOCTYPE html>
<html lang="en">

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>INTEGRADORA</title>
    <link rel="stylesheet" href="./assets/css/principal.css">
</head>

<body>
<header>
    <img src="./assets/img/utez.png" alt="logo Utez" id="left-image" height: 100px; margin-top: 20px;>
    <h1 id="title">INTEGRADORA ESTRUCTURA DE DATOS</h1>
    <img src="./assets/img/datid.png" alt="Logo DATID" id="right-image" height: 100px; margin-top: 20px;>
</header>

<div id="big-title">GESTION DE TAREAS</div>
<br>
<br>
<div class="col-12 col-sm col-xl-12">
    <div id="button-containes"
         style="display: flex; justify-content: space-around; align-items: center; height: 100px; margin-top: 20px;">
        <button class="big-button" onclick="window.location.href='jsp/agregar.jsp'">AGREGAR</button>
        <button class="big-button" onclick="window.location.href='pantallas/editar.html'">EDITAR</button>
        <button class="big-button" onclick="window.location.href='pantallas/eliminar.html'">ELIMINAR</button>
        <button class="big-button" onclick="window.location.href='pantallas/mostrar.html'">MOSTRAR</button>
    </div>
</div>
<br>
<br>
<div id="dropdown-containes" style="text-align: right; margin-top: 20px; margin-right: 60px;">
    <label for="fecha" style="color: white;">FECHA: </label>
    <select id="fecha">
        <option value="fecha">AQUI</option>
        <option value="fecha">VAN</option>
        <option value="fecha">TODAS</option>
        <option value="fecha">LAS</option>
        <option value="fecha">FECHAS</option>
    </select>
</div>
<br>
<br>
<div id="status-buttons"
     style="display: flex; justify-content: space-around; align-items: center; height: 100px; margin-top: 20px;">
    <button class="big-button programadas" onclick="displayData('Datos de Programadas', 'left')">PROGRAMADAS</button>
    <button class="big-button pendientes" onclick="displayData('Datos de Pendientes', 'center')">PENDIENTES</button>
    <button class="big-button completas" onclick="displayData('Datos de Completas', 'right')">COMPLETAS</button>
</div>
<div id="data-display" style="margin-top: 20px; text-align: center;"></div>

<script>
    document.getElementById('agregarBtn').addEventListener('click', function () {
    });
</script>

</body>


</html>