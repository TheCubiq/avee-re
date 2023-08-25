.class public final Lcom/daaw/ul3;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/nio/charset/Charset;

.field public static final b:Lcom/daaw/rl3;

.field public static final c:Lcom/daaw/pl3;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "UTF-8"

    invoke-static {v0}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    move-result-object v0

    sput-object v0, Lcom/daaw/ul3;->a:Ljava/nio/charset/Charset;

    new-instance v0, Lcom/daaw/tl3;

    invoke-direct {v0}, Lcom/daaw/tl3;-><init>()V

    sput-object v0, Lcom/daaw/ul3;->b:Lcom/daaw/rl3;

    sget-object v0, Lcom/daaw/sl3;->a:Lcom/daaw/sl3;

    sput-object v0, Lcom/daaw/ul3;->c:Lcom/daaw/pl3;

    return-void
.end method

.method public static synthetic a(Lorg/json/JSONObject;)Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ljava/io/ByteArrayInputStream;

    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0

    sget-object v1, Lcom/daaw/ul3;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    return-object v0
.end method
