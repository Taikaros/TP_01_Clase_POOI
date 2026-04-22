//Comentarios
// ---Guia de formato de comentario---
//! Un Error o no Usar un metod
//? Comentario de pregunta
// * Resaltar algo importante
/** @param {Tipo:param} nombreParam parametros o estructura de una funcion */

//* Objetivos
//*  Crear una Clase compleja que combine arrays, encapsilamiento, logia de negocio(operaciones CRUD), validaciones y manejo de estado
//* Descripcion
//** Implementar una clase @AgendaTelefonica que permita gestionar contactos telefonicos con operaciones de alta, baja, modificacion y consulta 
/** @param AgendaTelefonica {class} AgendaTelefonica - clase principal para el desarrollo del prolema 
//* Requisitos
/** @param Contacto {Class Internal} Contacto - clase interna que gestiono los contactos
/** @param nombre {string} nombre - atributo privado de la clase Contacto 
*   @param telefono {string[10]} telefono - atributo interno de la calse Contacto 
*/
//* ---Metodos --- */
/**
 * @param Contacto(String nombre, String telefono) {Constructor} es un constructor
 * Getters:
 * @param getNombre() metodo para obtener el nombre
 * @param getTelefono() metodo para obtener el telefono 
 * @param setTelefono(String telefono) tiene que estas vacio(void)
 * @param toString() {string} representacion del contacto
 */
//* ---Validacion de Telefono--- */
/**
 *! Debe tener exactamente 10 caracteres y todos deben ser digitos(0-9)
 *  @param AgendaTelefonica:
 ** Constante
 *  @param CAPACIDAD_MAXIMA {Static final int} - Constate con valor 10
 *  * Atributos Privados
 *  @param contacto {Contacto[]} - array de la clase contacto
 *  @param cantidadContactos {int} - cantidad actual de contactos
 *  *Constructor
 *  TODO: Inicializa el array con capacidad para @CAPACIDAD_MAXIMA contactos
 *  TODO: Inicializar @cantidadContactos en 0
 * 
 * *---Operaciones CRUD y utilidades:
 * * 1 Crear (Agregar)
 *  @param agregarContacto(String nombre, String telefono) {boolean}
 * TODO: Verifica que haya espacio disponible
 * TODO: Verificar que no exista un contacto con el mismo nombre (No es case sensitive);
 * TODO: Verifica que el Telefono tenga 10 digitos
 * TODO: Si todo es valido,agregar el contacto y retorna @true 
 * 
 ** 2 Leer (Buscar)
 * @param buscarPorNombre(String Nombre) {Contacto} - busca por nombre exacto (sin distinguir  entre mayúsculas/minúsculas). Retorna el contacto o @null
 * @param buscarPorTelefono(String telefono)  {Contacto} - Busca por numero de telefono exacto
 * @param buscarPorNombreParcial(String-prefijo) {String[]} - Retorna un array con los nombres de todos los contactos que contengan el prefijo. El array debe tener el tamaño exacto de las coincidencias
 * 
 * * 3 Actualizar
 * @param actualizarTelefono(String nombre, String nuevoTelefono) {boolean} - busca el contacto por nombre. Si existe y el nuevo telefono es valido, lo actualiza y retorna 
 * @return true
 * 
 * * 4 Eliminar
 * @param eliminarContacto(String nombre) {boolean}- Buscar el contacto por nombre. si existe, lo elimina y reordena el array para que no quede huecos(compactacion).
 * @return ture si se elimino
 * 
 * * 5 Utilidades 
 * @param listaContactos() {void} - Muestra todos los contactos 
 * @param estaLlena() {boolean}
 * @return true si la agenda esta llena
 * @param obtenerCantidad() {int} - retorna cuantos contactos hay
 * @param obtenerEspaciosDisponibles() {int} - retorna cuantos espacios quedan libres
 * 
 * 
 * *--- Metodo main
 *  *realizas un flujo completo de pruebas 
 * TODO: 1 Agregar 3 contactos validos con diferentes nombres y telefonos
 * TODO: 2 Intentar agregar un contacto con telefono invalido (debe fallar)
 * TODO: 3 Intentar agregar un contacto con nombre duplicado (debe fallar, probar mayuscula/minusculas)
 * TODO: 4 Listar todos los contactos
 * TODO: 5 Buscar por nombr( uno que existe, variando mayúsculas/minúsculas)
 * TODO: 6 Buscar por telefono
 * TODO: 7 Actualizar el telefono de un contacto existente
 * TODO: 8 Intentar actualizar con telefono invalido (debe fallar)
 * TODO: 9 Buscar por nombre parcial (ej: buscar "ar" debe encontrar "Maria", "Carlos",etc)
 * TODO: 10 Mostrar estadisticas: cantidad de contactos, espacios disponibles, si esta llena
 * TODO: 11 Eliminar un contacto (usar nombre con mayúsculas diferentes)
 * TODO: 12 Listar contactos nuevamente y verificar que se reordenó correctamente 
 * TODO: 13 Agregar contactos hasta llenar la agenda
 * TODO: 14 Verificar que esta llena e intentar agregar otro (debe fallar)
 * 
 * *---Conceptos a aplicar---
 * Composicion(clase dentro de clase)
 * Encapsulamiento estricto
 * Arrays con capacidad fija
 * Validaciones multiples
 * Comparacion de string sin distinguir mayusculas/minusculas
 * Reprdenamientos de arrays (compactacion tras eliminacion)
 * Creacion dinamica de arrays de resultado
 * Gestion de estado compleja
 * */
public class AgendaTelefonica {
    

}