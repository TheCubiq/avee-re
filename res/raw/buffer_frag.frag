
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
//uniform sampler2D u_texture;

//uniform sampler2D u_texture2;
//uniform float maskadd;
//uniform float maskmul;

//void main() {
//
//	vec4 color1 = texture2D(u_texture,vTexCoord);
//	vec4 color2 = texture2D(u_texture2,vTexCoord);
//
//	color1 = vColor * color1;
//	color1.a = color1.a * (maskadd + (color2.a * maskmul));
//	//color1 = color1 * (maskadd + (color2.a * maskmul));
//	//color1 + color2 * color1.a;
//	gl_FragColor = color1;
//}

//declare uniforms
uniform sampler2D u_texture;

void main() {
	vec4 color1 = texture2D(u_texture,vTexCoord);

		//if(color1.a == 0.0) discard;

	gl_FragColor = vColor * color1;
}