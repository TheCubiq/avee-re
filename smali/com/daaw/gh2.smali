.class public final Lcom/daaw/gh2;
.super Lcom/daaw/hz7;
.source ""


# static fields
.field public static final x:Lcom/daaw/oz7;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-class v0, Lcom/daaw/gh2;

    invoke-static {v0}, Lcom/daaw/oz7;->b(Ljava/lang/Class;)Lcom/daaw/oz7;

    move-result-object v0

    sput-object v0, Lcom/daaw/gh2;->x:Lcom/daaw/oz7;

    return-void
.end method

.method public constructor <init>(Lcom/daaw/iz7;Lcom/daaw/fh2;)V
    .locals 2

    invoke-direct {p0}, Lcom/daaw/hz7;-><init>()V

    invoke-interface {p1}, Lcom/daaw/iz7;->zzc()J

    move-result-wide v0

    invoke-virtual {p0, p1, v0, v1, p2}, Lcom/daaw/hz7;->w(Lcom/daaw/iz7;JLcom/daaw/fh2;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lcom/daaw/hz7;->q:Lcom/daaw/iz7;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x7

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "model("

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
