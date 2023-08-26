
precision mediump float;
precision mediump int;
precision lowp sampler2D;
precision lowp samplerCube;

//"in" attributes from our vertex shader
varying vec4 vColor;
varying vec2 vTexCoord;

//declare uniforms
uniform sampler2D u_texture;
uniform float blurW;
uniform float resolutionH;
uniform vec2 resolution;

void main() {
	vec4 sum = vec4(0.0);

    //sigma 1.7515

    //apply blurring, using a 9-tap filter with predefined gaussian weights
	////sum += texture2D(u_texture, vec2(vTexCoord.x - 4.0*blurW, vTexCoord.y)) * 0.0162162162;
	//sum += texture2D(u_texture, vec2(vTexCoord.x - 3.0*blurW, vTexCoord.y)) * 0.0540540541;
	//sum += texture2D(u_texture, vec2(vTexCoord.x - 2.0*blurW, vTexCoord.y)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x - 1.0*blurW, vTexCoord.y)) * 0.1945945946;
	
	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y)) * 0.2270270270;
	
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 1.0*blurW, vTexCoord.y)) * 0.1945945946;
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 2.0*blurW, vTexCoord.y)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 3.0*blurW, vTexCoord.y)) * 0.0540540541;
	////sum += texture2D(u_texture, vec2(vTexCoord.x + 4.0*blurW, vTexCoord.y)) * 0.0162162162;


	//sum += texture2D(u_texture, vec2(vTexCoord.x - 3.0*blurW, vTexCoord.y)) * 0.0540540541;
	//sum += texture2D(u_texture, vec2(vTexCoord.x - 2.0*blurW, vTexCoord.y)) * 0.1216216216;
	//    sum += texture2D(u_texture, vec2(vTexCoord.x - 1.5*blurW, vTexCoord.y)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x - 1.0*blurW, vTexCoord.y)) * 0.1945945946;
	//    sum += texture2D(u_texture, vec2(vTexCoord.x - 0.5*blurW, vTexCoord.y)) * 0.1945945946;

	//sum += texture2D(u_texture, vec2(vTexCoord.x, vTexCoord.y)) * 0.2270270270;

	//    sum += texture2D(u_texture, vec2(vTexCoord.x + 0.5*blurW, vTexCoord.y)) * 0.1945945946;
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 1.0*blurW, vTexCoord.y)) * 0.1945945946;
	//    sum += texture2D(u_texture, vec2(vTexCoord.x + 1.5*blurW, vTexCoord.y)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 2.0*blurW, vTexCoord.y)) * 0.1216216216;
	//sum += texture2D(u_texture, vec2(vTexCoord.x + 3.0*blurW, vTexCoord.y)) * 0.0540540541;

   // gl_FragColor = sum * 0.6;

//vI
    //float iy = mod(vTexCoord.y * resolutionH * 0.75, 0.75);// 0.75 = 3/4
    //sum += texture2D(u_texture, vec2(vTexCoord.x + ((iy-3.0)*blurW), vTexCoord.y)) * 0.0540540541;
    //sum += texture2D(u_texture, vec2(vTexCoord.x + ((iy-2.0)*blurW), vTexCoord.y)) * 0.1216216216;
    //sum += texture2D(u_texture, vec2(vTexCoord.x + (-1.0+iy)*blurW, vTexCoord.y)) * 0.1945945946;
    //sum += texture2D(u_texture, vec2(vTexCoord.x+iy*blurW, vTexCoord.y)) * 0.2270270270;
    //sum += texture2D(u_texture, vec2(vTexCoord.x + (1.0+iy)*blurW, vTexCoord.y)) * 0.1945945946;
    //sum += texture2D(u_texture, vec2(vTexCoord.x + (2.0+iy)*blurW, vTexCoord.y)) * 0.1216216216;
    //sum += texture2D(u_texture, vec2(vTexCoord.x + (3.0+iy)*blurW, vTexCoord.y)) * 0.0540540541;

    //vII
    float iy = 0.0;//mod(vTexCoord.y * resolutionH * 0.75, 0.75);
    vec2 dirAmount2 = vec2(blurW, 0.0);
                    //Sigma 3.0; Size 9
                                    sum += texture2D(u_texture, vTexCoord + ((iy-4.0)*dirAmount2)) * 0.063327;
                                    sum += texture2D(u_texture, vTexCoord + ((iy-3.0)*dirAmount2)) * 	0.093095;
                                    sum += texture2D(u_texture, vTexCoord + ((iy-2.0)*dirAmount2)) * 0.122589;
                                    sum += texture2D(u_texture, vTexCoord + ((iy-1.0)*dirAmount2)) * 	0.144599;
                                    sum += texture2D(u_texture, vTexCoord+ ((iy)*dirAmount2)) * 	0.152781;
                                    sum += texture2D(u_texture, vTexCoord + ((iy+1.0)*dirAmount2)) * 	0.144599;
                                    sum += texture2D(u_texture, vTexCoord + ((iy+2.0)*dirAmount2)) * 0.122589;
                                    sum += texture2D(u_texture, vTexCoord + ((iy+3.0)*dirAmount2)) * 	0.093095;
                                    sum += texture2D(u_texture, vTexCoord + ((iy+4.0)*dirAmount2)) * 0.063327;
    gl_FragColor = sum;// * 0.71348682;


//vIII
//vec2 direction = vec2(blurW, 0.0);
////vec2 resolution = vec2(resolutionH,1.0);
//vec2 uv = vTexCoord;

//  vec4 color = vec4(0.0);
//  vec2 off1 = vec2(1.411764705882353) * direction;
//  vec2 off2 = vec2(3.2941176470588234) * direction;
//  vec2 off3 = vec2(5.176470588235294) * direction;
//  color += texture2D(u_texture, uv) * 0.1964825501511404;
//  color += texture2D(u_texture, uv + (off1 / resolution)) * 0.2969069646728344;
//  color += texture2D(u_texture, uv - (off1 / resolution)) * 0.2969069646728344;
//  color += texture2D(u_texture, uv + (off2 / resolution)) * 0.09447039785044732;
//  color += texture2D(u_texture, uv - (off2 / resolution)) * 0.09447039785044732;
//  color += texture2D(u_texture, uv + (off3 / resolution)) * 0.010381362401148057;
//  color += texture2D(u_texture, uv - (off3 / resolution)) * 0.010381362401148057;
//    gl_FragColor = color;


}