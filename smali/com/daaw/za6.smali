.class public final Lcom/daaw/za6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/wz7;


# instance fields
.field public final a:Lcom/daaw/wa6;


# direct methods
.method public constructor <init>(Lcom/daaw/wa6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/za6;->a:Lcom/daaw/wa6;

    return-void
.end method

.method public static b(Lcom/daaw/wa6;)Z
    .locals 0

    invoke-virtual {p0}, Lcom/daaw/wa6;->g()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final a()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/daaw/za6;->a:Lcom/daaw/wa6;

    invoke-virtual {v0}, Lcom/daaw/wa6;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic zzb()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lcom/daaw/za6;->a()Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
