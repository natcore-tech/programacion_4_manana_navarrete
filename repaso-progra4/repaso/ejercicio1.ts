import * as readlineSync from 'readline-sync';
function main(): void {
const TOTAL = 5;
let tarifaMaxima = 0;
for (let i = 1; i <= TOTAL; i++) {
const placa = readlineSync.question(`Vehiculo ${i} - Placa: `);
const horas = parseInt(
readlineSync.question(`Vehiculo ${i} - Horas estacionado: `),
10
);
let costo: number;
let categoria: string;
if (horas === 0) {
costo = 0;
categoria = 'Gratis';
} else if (horas <= 2) {
costo = horas * 1.50;
categoria = 'Tarifa normal';
} else if (horas <= 5) {
costo = horas * 1.00;
categoria = 'Tarifa reducida';
} else {
costo = 8.00;
categoria = 'Tarifa maxima';
tarifaMaxima++;
}
console.log(`[${placa}] ${horas} h -> ${categoria} $${costo.toFixed(2)}`);
}
console.log('');
console.log('=== RESUMEN ===');
console.log(`Vehiculos con tarifa maxima: ${tarifaMaxima}`);
}
main();