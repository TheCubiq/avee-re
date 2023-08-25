.class public final synthetic Lcom/daaw/e04;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/i04;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Map;


# direct methods
.method public synthetic constructor <init>(ILjava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/daaw/e04;->a:I

    iput-object p2, p0, Lcom/daaw/e04;->b:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(Landroid/util/JsonWriter;)V
    .locals 2

    iget v0, p0, Lcom/daaw/e04;->a:I

    iget-object v1, p0, Lcom/daaw/e04;->b:Ljava/util/Map;

    invoke-static {v0, v1, p1}, Lcom/daaw/j04;->b(ILjava/util/Map;Landroid/util/JsonWriter;)V

    return-void
.end method
