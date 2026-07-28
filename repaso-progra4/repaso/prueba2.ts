import * as readLineSync from 'readline-sync';

interface ResumenMembresia {
    precioBase: number;
    subtotal: number;
    descuento: number;
    total: number;
    nombre: string;
}

function calcularMembresia(plan: number, meses: number): ResumenMembresia {
    let precioBase: number;
    let descuentoPct: number;
    let nombre: string;

    switch (plan) {
        case 1:
            nombre = 'Basico';
            precioBase = 25.0;
            descuentoPct = 0.0;
            break;
        case 2:
            nombre = 'Estandar';
            precioBase = 40.0;
            descuentoPct = 0.05;
            break;    
        case 3:
            nombre = 'Premium';
            precioBase = 65.0;
            descuentoPct = 0.10;
            break;
        case 4:
            nombre = 'Elite';
            precioBase = 90.0;
            descuentoPct = 0.15;
            break;
        default:
            nombre = 'Desconocido';
            precioBase = 0;
            descuentoPct = 0;       
    }

    const subtotal = precioBase * meses;
    const descuento = subtotal * descuentoPct;
    const total = subtotal - descuento;

    return{
        precioBase,
        subtotal,
        descuento,
        total,
        nombre
    };
}

function main(): void {
    const plan = parseInt(readLineSync.question('Plan (1-4): '));
    const meses = parseInt(readLineSync.question('Meses: '));

    const { precioBase, subtotal, descuento, total } = calcularMembresia(plan, meses);

    console.log(`
        === RESUMEN DE MEMBRESIA ===
        Precio mensual: $${precioBase.toFixed(2)}
        Subtotal      : $${subtotal.toFixed(2)}
        Descuento     : $${descuento.toFixed(2)}
        Total a pagar : $${total.toFixed(2)}
    `);
}

main();