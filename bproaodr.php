<div class="contenedor">
    <!-- Tarjeta de Presentación -->
    <div id="tarjeta" class="tarjeta">
        <h2>Detalles del Propietario</h2>
        <?php if (isset($mensaje)) { echo "<p>$mensaje</p>"; } ?>
        <p><strong>ID:</strong> <?php echo $row['id']; ?></p>
        <p><strong>Propietario:</strong> <?php echo $row['propietario']; ?></p>
        <p><strong>Dirección:</strong> <?php echo $row['direccion']; ?></p>
        <p><strong>Teléfono:</strong> <?php echo $row['telefono']; ?></p>
        <p><strong>DNI:</strong> <?php echo $row['dni']; ?></p>
        <p><strong>Fecha de registro:</strong> <?php echo $row['fechaSeguimientoInicio']; ?></p>

        <!-- Detalles de la Mascota -->
        <?php if ($mascota_detalles): ?>
        <div id="detalles-mascota" class="detalles-mascota">
            <h3>Detalles de la Mascota</h3>
            <p><strong>Nombre:</strong> <?php echo $mascota_detalles['nombre']; ?></p>
            <p><strong>Especie:</strong> <?php echo $mascota_detalles['especie']; ?></p>
            <p><strong>Raza:</strong> <?php echo $mascota_detalles['raza']; ?></p>
            <p><strong>Color:</strong> <?php echo $mascota_detalles['color']; ?></p>
            <p><strong>Sexo:</strong> <?php echo $mascota_detalles['sexo']; ?></p>
            <p><strong>Fecha de Nacimiento:</strong> <?php echo $mascota_detalles['fechaNacimiento']; ?></p>
            <p><strong>Descripción:</strong> <?php echo $descripcion; ?></p>
        </div>
        <?php endif; ?>

        <!-- Botones de acción -->
        <div class="button-container">
            <button onclick="document.getElementById('form-editar').style.display = 'block';">Editar</button>
            <a href="descargar_pdf.php?id=<?php echo $row['id']; ?>">Descargar en PDF</a>
            <button onclick="descargarTarjeta()">Descargar imagen</button>
            <button class="open-modal-btn">Agregar Descripción</button>
        </div>
    </div>

    <!-- Modal -->
    <div class="modal-overlay" id="modalOverlay">
        <div class="modal">
            <button class="close-modal-btn" id="closeModalBtn">X</button>
            <h2>Agregar Información</h2>
            <form id="addForm">
                <input type="hidden" id="mascota_id" value="ID_DE_LA_MASCOTA">
                <input type="text" id="titulo" placeholder="Título" required>
                <textarea id="descripcion" placeholder="Descripción"></textarea>
                <button type="submit">Guardar</button>
            </form>
        </div>
    </div>
</div>

<script>
    // Elementos del DOM
    const openModalBtn = document.querySelector('.open-modal-btn');
    const modalOverlay = document.getElementById('modalOverlay');
    const closeModalBtn = document.getElementById('closeModalBtn');

    // Abrir el modal al presionar el botón
    openModalBtn.addEventListener('click', () => {
      modalOverlay.style.display = 'flex';
    });

    // Cerrar el modal al presionar el botón "X"
    closeModalBtn.addEventListener('click', () => {
      modalOverlay.style.display = 'none';
    });

    // Cerrar el modal al hacer clic fuera del formulario
    modalOverlay.addEventListener('click', (event) => {
      if (event.target === modalOverlay) {
        modalOverlay.style.display = 'none';
      }
    });

    // Manejar el formulario
    const form = document.getElementById('addForm');
    form.addEventListener('submit', (event) => {
      event.preventDefault();
      alert('¡Información agregada con éxito!');
      modalOverlay.style.display = 'none';
    });
</script>
























   <div id="historial" class="historial">
    <h3>Historial de Visitas</h3>
    <ul id="lista-historial">
        <!-- Mostrar la descripción del historial -->
        <li><?php echo $descripcion; ?></li>
    </ul>