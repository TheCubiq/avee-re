.class public abstract Lcom/daaw/zx6;
.super Lcom/daaw/xx6;
.source ""


# instance fields
.field public final p:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Lcom/daaw/xx6;-><init>()V

    const-string p1, "CharMatcher.none()"

    iput-object p1, p0, Lcom/daaw/zx6;->p:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/zx6;->p:Ljava/lang/String;

    return-object v0
.end method
