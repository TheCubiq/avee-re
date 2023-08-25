.class public final Lcom/daaw/v87;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final b:Lcom/daaw/v87;

.field public static final c:Lcom/daaw/v87;

.field public static final d:Lcom/daaw/v87;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/daaw/v87;

    const-string v1, "ENABLED"

    invoke-direct {v0, v1}, Lcom/daaw/v87;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/v87;->b:Lcom/daaw/v87;

    new-instance v0, Lcom/daaw/v87;

    const-string v1, "DISABLED"

    invoke-direct {v0, v1}, Lcom/daaw/v87;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/v87;->c:Lcom/daaw/v87;

    new-instance v0, Lcom/daaw/v87;

    const-string v1, "DESTROYED"

    invoke-direct {v0, v1}, Lcom/daaw/v87;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/daaw/v87;->d:Lcom/daaw/v87;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/v87;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/v87;->a:Ljava/lang/String;

    return-object v0
.end method
