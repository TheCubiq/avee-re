//combined projection and view matrix
uniform mat4 u_projView;

//"in" attributes
attribute vec3 Position;
attribute vec2 TexCoord;
attribute vec4 Color;

//"out" varyings to our fragment shader
varying vec4 vColor;
varying vec2 vTexCoord;
 
void main() {
	vColor = Color;
	vTexCoord = TexCoord;
	gl_Position = u_projView * vec4(Position, 1.0);
	//gl_Position = vec4(Position, 0.0, 1.0);

	    // vTexCoord = Position.xy*madd+madd;
        // gl_Position = vec4(Position,1.0);
}