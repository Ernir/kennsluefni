function pendulumexample
% Teiknar hreyfimynd af einföldum pendúl með föstum stærðum

g = -9.8; % Þyngdarafl
L = -10; % Lengd pendúlsins
theta0 = 20; % Upphafshorn í gráðum
t = linspace(0,500,101); % Tímaskref

% Endurtekið reiknað upp úr hreyfijöfnu, 
% niðurstöður skráðar í F
i = 1;
F(length(t)) = struct('cdata',[],'colormap',[]);
for ti = t
    theta = theta0*cosd(sqrt(g/L)*ti); % Útreikningur
    x = L*sind(theta); % Flutningur í hnitakerfi
    y = L*cosd(theta);
    axis([-6 6 -12 0])
    line([0 x],[0 y])
    rectangle('Position', [x-0.5 y-0.5 1 1], ... 
        'Curvature', [1, 1], 'Facecolor', [1 0 0]);
    axis square;
    F(i) = getframe;
    clf;
    i = i + 1;
end

% Gögnin í F sameinuð í hreyfimynd
v = VideoWriter('pendulum','Uncompressed AVI');
open(v);
writeVideo(v, F);
close(v);
close

end
