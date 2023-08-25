
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
//varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;

uniform sampler2D u_texture2;

uniform vec2 dirAmount;

uniform vec3 splitColor0;
uniform vec3 splitColor1;
uniform vec3 splitColor2;

void main() {

    //vec2 vTexCoordOffset = vec2(0.003, 0.003);

	vec4 color0 = texture2D(u_texture,vTexCoord+dirAmount);
	vec4 color1 = texture2D(u_texture,vTexCoord);
	vec4 color2 = texture2D(u_texture,vTexCoord-dirAmount);
	//vec4 color2 = texture2D(u_texture2,vTexCoord);

//color1.r = color0.r;
//color1.g = 0.0;
//color1.b = color2.b;

vec4 finalColor;// = vec4(1.0, 1.0, 1.0, 1.0);

finalColor.r = (color0.r * splitColor0.r) + (color1.r * splitColor1.r) + (color2.r * splitColor2.r);
finalColor.g = (color0.g * splitColor0.g) + (color1.g * splitColor1.g) + (color2.g * splitColor2.g);
finalColor.b = (color0.b * splitColor0.b) + (color1.b * splitColor1.b) + (color2.b * splitColor2.b);

finalColor.a = (color0.a + color1.a + color2.a) * 0.33333333;

	//color1 = vColor * color1;
	//color1.a = color1.a * (maskadd + (color2.a * maskmul));

	//color1.a = color1.a * color2.a;
	gl_FragColor = finalColor;
	//gl_FragColor = vec4(1.0, 0.0, 0.0 ,1.0);
}