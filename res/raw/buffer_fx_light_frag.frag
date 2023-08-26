
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;

uniform sampler2D u_texture2;
uniform float maskadd;
uniform float maskmul;
uniform float mask_l_add;
uniform float mask_l_mul;
//uniform   mat4        mat_tex1;//transform

uniform float tex2_y_add;
uniform float tex2_y_mul;

uniform vec4 Color2;//Colorize

uniform float saturation;

const vec3 W = vec3(0.2125, 0.7154, 0.0721);

void main() {
    //vec2 uv1 = (mat_tex1 * vec4(vTexCoord, 0.0, 1.0)).xy;
    //vec2 uv1 = (mat_tex1 * vec3(vTexCoord, 1.0)).xy;

	//vec4 color1 = texture2D(u_texture,uv1);
	vec4 color1 = texture2D(u_texture,vTexCoord);
	//vec4 color2 = texture2D(u_texture2,vTexCoord);
	vec4 color2 = texture2D(u_texture2,vec2(vTexCoord.x, tex2_y_add+(vTexCoord.y*tex2_y_mul)));

    vec3 intensity = vec3(dot(color1.rgb, W));
    color1.rgb =  mix(intensity, color1.rgb, saturation);

	color1 = vColor * color1;

	//Colorize
	color1 = vec4((Color2.rgb * color1.a) + (color1.rgb), color1.a);
	//gl_FragColor = vec4(((Color2.rgb) + (color1.rgb*color1.a))*color1.a, color1.a);

	float lightness = max(color2.r, max(color2.g, color2.b));
	color1.a = color1.a * (maskadd + (color2.a * maskmul)) * (mask_l_add + (lightness * mask_l_mul));
    //color1.a = lightness;
	//color1.a = color1.a * color2.a;
	//color1.r = vTexCoord.x;
	//color1.g = vTexCoord.y;

	//if(color1.a < 0.001) discard;

	gl_FragColor = color1;





}