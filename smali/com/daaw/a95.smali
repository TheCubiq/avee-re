.class public final Lcom/daaw/a95;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/x85;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/daaw/x85;

    invoke-direct {v0}, Lcom/daaw/x85;-><init>()V

    iput-object v0, p0, Lcom/daaw/a95;->a:Lcom/daaw/x85;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/a95;)Lcom/daaw/x85;
    .locals 0

    iget-object p0, p0, Lcom/daaw/a95;->a:Lcom/daaw/x85;

    return-object p0
.end method


# virtual methods
.method public final b()Lcom/daaw/x85;
    .locals 1

    iget-object v0, p0, Lcom/daaw/a95;->a:Lcom/daaw/x85;

    return-object v0
.end method
