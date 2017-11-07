x = linspace(-10,10);
y = sin(x).*x;
plot(x,y,'r*--')
axis([-10 10 -12 12])
title('Fallið f(x) = sin(x)\cdot{}x')
grid on